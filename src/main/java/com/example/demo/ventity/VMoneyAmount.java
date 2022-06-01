package com.example.demo.ventity;

import java.math.BigDecimal;

public class VMoneyAmount {
    private BigDecimal crediting = new BigDecimal(0);
    private BigDecimal amount = new BigDecimal(0);
    private BigDecimal currentPageAmount = new BigDecimal(0);
    private BigDecimal currentPageCrediting = new BigDecimal(0);

    public BigDecimal getCurrentPageAmount() {
        return currentPageAmount;
    }

    public void setCurrentPageAmount(BigDecimal currentPageAmount) {
        this.currentPageAmount = currentPageAmount;
    }

    public BigDecimal getCurrentPageCrediting() {
        return currentPageCrediting;
    }

    public void setCurrentPageCrediting(BigDecimal currentPageCrediting) {
        this.currentPageCrediting = currentPageCrediting;
    }

    public BigDecimal getCrediting() {
        return crediting;
    }

    public void setCrediting(BigDecimal crediting) {
        this.crediting = crediting;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
