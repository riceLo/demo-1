package com.example.demo.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.demo.constroller.config.DicConstant;
import com.example.demo.dao.CDicMapper;
import com.example.demo.entity.CConstract;
import com.example.demo.entity.CDic;
import com.example.demo.entity.CDicExample;

import com.example.demo.entity.CPay;
import com.example.demo.exception.DicDataNotFoundException;
import com.example.demo.exception.DicTooManyDataException;
import com.example.demo.service.IConstractService;
import com.example.demo.ventity.ConstractExcel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
//@Scope("prototype")
public class ReadConstractExcelListener extends AnalysisEventListener<ConstractExcel> {

    private static final int BSATCH_COUNT = 1;
     private List<ConstractExcel> list = new ArrayList<>();

//     @Autowired
     private IConstractService constractService;

//     @Autowired
     private CDicMapper dicMapper;

     //用于将导入失败的数据写回excel
     private Map<Integer,String> errorMsg = new HashMap<>();

     private Integer successCount = 0;

    public ReadConstractExcelListener(IConstractService constractService, CDicMapper dicMapper) {
        this.constractService = constractService;
        this.dicMapper = dicMapper;
    }

    @Override
    public void invoke(ConstractExcel data, AnalysisContext context) {
        System.out.println(data);

        list.add(data);
        if(list.size() == BSATCH_COUNT){
            //本地DAO保存到数据库
            // System.out.println(cmapper);
            List<CConstract> datas = this.combineConstract(list,context);
            System.out.println(datas);
            for (CConstract ct:datas){
                try {
                    constractService.addOrUpdateConstract(ct);
                    successCount++;
                }catch (Exception e){
                    e.printStackTrace();
                    String msg = e.getMessage();
                    if(e.getMessage().contains("Duplicate entry")){
                        msg = "数据库有重复的值";
                    }
                    Integer currentRowNum = context.readRowHolder().getRowIndex();
                    errorMsg.put(currentRowNum,msg);
                }
            }
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        //本地DAO保存到数据库
        List<CConstract> datas = this.combineConstract(list,context);
        for (CConstract ct:datas){
            try {
                constractService.addOrUpdateConstract(ct);
                successCount++;
            }catch (Exception e){
                e.printStackTrace();
                String msg = e.getMessage();
                if(e.getMessage().contains("Duplicate entry")){
                    msg = "数据库有重复的值";
                }
                Integer currentRowNum = context.readRowHolder().getRowIndex();
                errorMsg.put(currentRowNum,msg);
            }
        }
        list.clear();
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        super.invokeHeadMap(headMap, context);
        //打印出表头
        System.out.println(headMap);
    }

    @Override
    public void onException(Exception exception, AnalysisContext context) throws Exception {
        super.onException(exception, context);
        System.out.println(exception);
        Integer currentRowNum = context.readRowHolder().getRowIndex();
        errorMsg.put(currentRowNum,exception.getMessage());
    }

    private List<CConstract> combineConstract(List<ConstractExcel> list,AnalysisContext context){
        List<CConstract> datas = new ArrayList<>();
        for(ConstractExcel ce:list){
            CConstract ct = new CConstract();
            ct.setAmount(ce.getAmount());
            try{
                ct.setClient(this.selectValueByDes("CONSTRACT","CLIENT",ce.getClient()));
                ct.setCode(ce.getCode());
                ct.setContact(ce.getContact());
                ct.setContacttel(ce.getContacttel());
                ct.setCrediting(ce.getCrediting());
                ct.setDeadline(ce.getDeadline());
                ct.setMaincode(ce.getMaincode());
                ct.setName(ce.getName());
                ct.setState(this.selectValueByDes("CONSTRACT","STATE",ce.getState()));
                ct.setYear(ce.getYear());

                if(ce.getDoConstract() != null){
                    CPay pay = new CPay();
                    pay.setMilestone(DicConstant.CPAY_MILESTONE_SIGN);
                    pay.setPercentage(ce.getDoConstract());
                    ct.getPays().add(pay);
                }
                if(ce.getFinalTest()!=null){
                    CPay pay = new CPay();
                    pay.setMilestone(DicConstant.CPAY_MILESTONE_FINAL_TEST);
                    pay.setPercentage(ce.getFinalTest());
                    ct.getPays().add(pay);
                }
                if(ce.getMaintenance()!=null){
                    CPay pay = new CPay();
                    pay.setMilestone(DicConstant.CPAY_MILESTONE_MAINTENANCE);
                    pay.setPercentage(ce.getMaintenance());
                    ct.getPays().add(pay);
                }

                if(ce.getOnLine()!=null){
                    CPay pay = new CPay();
                    pay.setMilestone(DicConstant.CPAY_MILESTONE_ONLINE);
                    pay.setPercentage(ce.getOnLine());
                    ct.getPays().add(pay);
                }

                if(ce.getInitialTest() !=null){
                    CPay pay = new CPay();
                    pay.setMilestone(DicConstant.CPAY_MILESTONE_INITIAL_TEST);
                    pay.setPercentage(ce.getInitialTest());
                    ct.getPays().add(pay);
                }


                List<CPay> pays = ct.getPays();
                int sum = 0;
                for (CPay p:pays){
                    sum = sum + p.getPercentage().byteValue();
                }

                if (sum != 100){
                    Integer currentRowNum = context.readRowHolder().getRowIndex();
                    errorMsg.put(currentRowNum,"比例不等于100");
                    continue;
                }
                datas.add(ct);
            }catch (DicDataNotFoundException | DicTooManyDataException e){
                e.printStackTrace();
                Integer currentRowNum = context.readRowHolder().getRowIndex();
                errorMsg.put(currentRowNum,"状态获客户不存在");
                continue;
            }
        }
        return datas;
    }


    private Byte selectValueByDes(String tableName,String fieldName,String des) throws DicDataNotFoundException, DicTooManyDataException {
        if(des == null||"".equals(des.trim())){
            throw new DicDataNotFoundException();
        }
        CDicExample dicExample = new CDicExample();
        dicExample.createCriteria().andDesEqualTo(des).andTablenameEqualTo(tableName).andFieldnameEqualTo(fieldName);
        List<CDic> datas = this.dicMapper.selectByExample(dicExample);
        if(datas == null||datas.isEmpty()){
            throw new DicDataNotFoundException();
        }else if(datas.size()>1){
            throw new DicTooManyDataException();
        }
        return datas.get(0).getValue();
    }

    public Map<Integer, String> getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(Map<Integer, String> errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }
}
