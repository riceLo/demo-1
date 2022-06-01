package com.example.demo.entity;

import java.math.BigDecimal;

public class VConstractAmount {
    private BigDecimal ucredit;

    private BigDecimal credit;

    public BigDecimal getUcredit() {
        return ucredit;
    }

    public void setUcredit(BigDecimal ucredit) {
        this.ucredit = ucredit;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }
}