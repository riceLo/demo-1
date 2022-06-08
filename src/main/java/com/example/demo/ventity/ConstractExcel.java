package com.example.demo.ventity;

import java.math.BigDecimal;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class ConstractExcel {
    @ExcelProperty(value= {"合同名称"})
    private String name;

    @ExcelProperty(value= {"合同编号"})
    private String code;

    @ExcelProperty(value= {"主合同编号"})
    private String maincode;

    @ExcelProperty(value= {"签订年份"})
    private Integer year;

    @ExcelProperty(value= {"合同金额"})
    private BigDecimal amount = new BigDecimal(0);

    @ExcelProperty(value= {"已收款金额"})
    private BigDecimal crediting = new BigDecimal(0);

    @ExcelProperty(value= {"状态"})
    private String state;

    @ExcelProperty(value= {"客户名称"})
    private String client;

    @ExcelProperty(value= {"客户联系人"})
    private String contact;

    @ExcelProperty(value= {"客户联系电话"})
    private String contacttel;

    @ExcelProperty(value= {"合同期限(月)"})
    private Byte deadline;

    @ExcelProperty(value= {"签订合同"})
    private Byte doConstract;

    @ExcelProperty(value= {"上线"})
    private Byte onLine;

    @ExcelProperty(value= {"初验"})
    private Byte initialTest;

    @ExcelProperty(value= {"终验"})
    private Byte finalTest;

    @ExcelProperty(value= {"终验后维保"})
    private Byte maintenance;



}
