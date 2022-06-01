package com.example.demo.service;

import com.example.demo.convert.ObjectConvert;
import com.example.demo.dao.CPayMapper;
import com.example.demo.entity.CPay;
import com.example.demo.entity.CPayExample;
import com.example.demo.ventity.VPay;
import com.example.demo.ventity.VPayMoneyAmount;
import com.example.demo.ventity.VPayStatics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PayService implements IPayService{
    @Autowired
    private CPayMapper payMapper;

    @Autowired
    private ObjectConvert objectConvert;
    @Override
    public VPayStatics listByConstractId(int constractId) throws Exception {
        CPayExample payExample = new CPayExample();
        payExample.createCriteria().andConstractidEqualTo(constractId);
        List<CPay> datas = this.payMapper.selectByExample(payExample);
        List<VPay> _datas = new ArrayList<>();
        for (CPay cpay:datas){
            VPay vpay = new VPay();
            objectConvert.convert(cpay,vpay);
            _datas.add(vpay);

        }
        VPayMoneyAmount vam = this.payMapper.selectStatics(constractId);
        VPayStatics vs = new VPayStatics(_datas,vam);
        return vs;
    }
}
