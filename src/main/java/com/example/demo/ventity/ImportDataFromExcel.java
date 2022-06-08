package com.example.demo.ventity;

public class ImportDataFromExcel {

    private String contextPath;
    private int successCount;
    private int errorCount;
    private int sum;

    public ImportDataFromExcel() {
    }

    public ImportDataFromExcel(String contextPath, int successCount, int errorCount) {
        this.contextPath = contextPath;
        this.successCount = successCount;
        this.errorCount = errorCount;
        this.sum = this.successCount + this.errorCount;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
