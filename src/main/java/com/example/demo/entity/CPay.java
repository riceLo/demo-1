package com.example.demo.entity;

import com.example.demo.constroller.config.DicConstant;

import java.math.BigDecimal;
import java.util.Date;

public class CPay {
    private Integer id;

    private Byte milestone;

    private Byte percentage;

    private Integer constractid;

    private Byte state = DicConstant.CPAY_STATE_UN_INNOICE;

    private BigDecimal unpaidamount = new BigDecimal("0");

    private Date invoicetime;

    private BigDecimal amount = new BigDecimal("0");

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getMilestone() {
        return milestone;
    }

    public void setMilestone(Byte milestone) {
        this.milestone = milestone;
    }

    public Byte getPercentage() {
        return percentage;
    }

    public void setPercentage(Byte percentage) {
        this.percentage = percentage;
    }

    public Integer getConstractid() {
        return constractid;
    }

    public void setConstractid(Integer constractid) {
        this.constractid = constractid;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public BigDecimal getUnpaidamount() {
        return unpaidamount;
    }

    public void setUnpaidamount(BigDecimal unpaidamount) {
        this.unpaidamount = unpaidamount;
    }

    public Date getInvoicetime() {
        return invoicetime;
    }

    public void setInvoicetime(Date invoicetime) {
        this.invoicetime = invoicetime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
