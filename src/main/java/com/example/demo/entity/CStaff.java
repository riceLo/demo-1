package com.example.demo.entity;

import java.util.Date;

public class CStaff {
    private Integer id;

    private String code;

    private String name;

    private String bankcar;

    private String idcard;

    private String tel;

    private String email;

    private Date recruits;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBankcar() {
        return bankcar;
    }

    public void setBankcar(String bankcar) {
        this.bankcar = bankcar;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRecruits() {
        return recruits;
    }

    public void setRecruits(Date recruits) {
        this.recruits = recruits;
    }
}