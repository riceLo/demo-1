package com.example.demo.entity;

import java.util.Date;

public class CAttachment {
    private Integer id;

    private String name;

    private String filepath;

    private String filecontextpath;

    private Date uploaddate;

    private Integer constractid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilecontextpath() {
        return filecontextpath;
    }

    public void setFilecontextpath(String filecontextpath) {
        this.filecontextpath = filecontextpath;
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public Integer getConstractid() {
        return constractid;
    }

    public void setConstractid(Integer constractid) {
        this.constractid = constractid;
    }
}