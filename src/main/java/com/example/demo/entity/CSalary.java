package com.example.demo.entity;

import java.math.BigDecimal;

public class CSalary {
    private Integer id;

    private Integer year;

    private Byte month;

    private Integer salary;

    private BigDecimal socialinsurance;

    private BigDecimal medicalinsurance;

    private BigDecimal housingfund;

    private BigDecimal tax;

    private BigDecimal actualsalary;

    private Byte type;

    private Integer staffid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public BigDecimal getSocialinsurance() {
        return socialinsurance;
    }

    public void setSocialinsurance(BigDecimal socialinsurance) {
        this.socialinsurance = socialinsurance;
    }

    public BigDecimal getMedicalinsurance() {
        return medicalinsurance;
    }

    public void setMedicalinsurance(BigDecimal medicalinsurance) {
        this.medicalinsurance = medicalinsurance;
    }

    public BigDecimal getHousingfund() {
        return housingfund;
    }

    public void setHousingfund(BigDecimal housingfund) {
        this.housingfund = housingfund;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getActualsalary() {
        return actualsalary;
    }

    public void setActualsalary(BigDecimal actualsalary) {
        this.actualsalary = actualsalary;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }
}