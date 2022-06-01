package com.example.demo.ventity;

import java.util.ArrayList;
import java.util.List;

public class VPayStatics {
    public List<VPay> datas = new ArrayList<>();
    private VPayMoneyAmount payMoneyAmount;

    public VPayStatics() {
    }

    public VPayStatics(List<VPay> datas, VPayMoneyAmount payMoneyAmount) {
        this.datas = datas;
        this.payMoneyAmount = payMoneyAmount;
    }

    public List<VPay> getDatas() {
        return datas;
    }

    public void setDatas(List<VPay> datas) {
        this.datas = datas;
    }

    public VPayMoneyAmount getPayMoneyAmount() {
        return payMoneyAmount;
    }

    public void setPayMoneyAmount(VPayMoneyAmount payMoneyAmount) {
        this.payMoneyAmount = payMoneyAmount;
    }
}
