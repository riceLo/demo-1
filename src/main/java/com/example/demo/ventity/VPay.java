package com.example.demo.ventity;

import com.example.demo.annotation.DicLable;

import java.math.BigDecimal;
import java.util.Date;

public class VPay {
    private Integer id;
    @DicLable(tableName = "PAY",fieldName = "MILESTONE")
    private String milestone;

    private Byte percentage;

    private Integer constractid;

    @DicLable(tableName = "PAY",fieldName = "STATE")
    private String state ;

    private BigDecimal unpaidamount = new BigDecimal("0");

    private Date invoicetime;

    private BigDecimal amount = new BigDecimal("0");

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
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
