package com.example.demo.ventity;

import java.math.BigDecimal;

public class VMoneyAmountStr {
    private String crediting ;
    private String amount ;
    private String currentPageAmount;
    private String currentPageCrediting;

    public String getCrediting() {
        return crediting;
    }

    public void setCrediting(String crediting) {
        this.crediting = crediting;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrentPageAmount() {
        return currentPageAmount;
    }

    public void setCurrentPageAmount(String currentPageAmount) {
        this.currentPageAmount = currentPageAmount;
    }

    public String getCurrentPageCrediting() {
        return currentPageCrediting;
    }

    public void setCurrentPageCrediting(String currentPageCrediting) {
        this.currentPageCrediting = currentPageCrediting;
    }
}
