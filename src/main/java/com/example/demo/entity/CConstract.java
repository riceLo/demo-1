package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CConstract {

    private Integer id;

    private String maincode;

    private String code;

    private String name;

    private byte client;

    private Integer year;

    private String contact;

    private String contacttel;

    private Byte deadline;

    private BigDecimal amount;

    private byte state;

    private BigDecimal crediting;

    private List<CPay> pays = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaincode() {
        return maincode;
    }

    public void setMaincode(String maincode) {
        this.maincode = maincode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getClient() {
        return client;
    }

    public void setClient(byte client) {
        this.client = client;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    public Byte getDeadline() {
        return deadline;
    }

    public void setDeadline(Byte deadline) {
        this.deadline = deadline;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    public BigDecimal getCrediting() {
        return crediting;
    }

    public void setCrediting(BigDecimal crediting) {
        this.crediting = crediting;
    }

    public List<CPay> getPays() {
        return pays;
    }

    public void setPays(List<CPay> pays) {
        this.pays = pays;
    }
}
