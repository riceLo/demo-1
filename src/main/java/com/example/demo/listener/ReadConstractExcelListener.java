package com.example.demo.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.demo.ventity.ConstractExcel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadConstractExcelListener extends AnalysisEventListener<ConstractExcel> {

    private static final int BSATCH_COUNT = 10;
    private List<ConstractExcel> list = new ArrayList<>();

    @Override
    public void invoke(ConstractExcel data, AnalysisContext context) {
        list.add(data);
        if(list.size()==BSATCH_COUNT){
            //本地DAO保存到数据库
            list.clear();
        }
    }
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        super.invokeHeadMap(headMap, context);
        System.out.println(headMap);
    }
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        //本地DAO保存到数据库
        list.clear();
    }
    @Override
    public void onException(Exception exception, AnalysisContext context) throws Exception {
        super.onException(exception, context);
        System.out.println(exception);
    }
}
