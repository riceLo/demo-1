package com.example.demo.ventity;

import java.math.BigDecimal;

public class VPayMoneyAmount {
    private BigDecimal amount = new BigDecimal("0");
    private BigDecimal unpay = new BigDecimal("0");
    private BigDecimal payFinish = new BigDecimal("0");

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getUnpay() {
        return unpay;
    }

    public void setUnpay(BigDecimal unpay) {
        this.unpay = unpay;
    }

    public BigDecimal getPayFinish() {
        return payFinish;
    }

    public void setPayFinish(BigDecimal payFinish) {
        this.payFinish = payFinish;
    }
}
