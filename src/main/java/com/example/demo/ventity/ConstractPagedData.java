package com.example.demo.ventity;

import com.github.pagehelper.PageInfo;

public class ConstractPagedData {

    private PageInfo<VConstract> pi;

    private  VMoneyAmount ma;

    public PageInfo<VConstract> getPi() {
        return pi;
    }

    public void setPi(PageInfo<VConstract> pi) {
        this.pi = pi;
    }

    public VMoneyAmount getMa() {
        return ma;
    }

    public void setMa(VMoneyAmount ma) {
        this.ma = ma;
    }

    public ConstractPagedData(PageInfo<VConstract> pi, VMoneyAmount ma) {
        this.pi = pi;
        this.ma = ma;
    }

    public ConstractPagedData() {
    }

}
