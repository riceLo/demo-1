package com.example.demo;


import com.alibaba.excel.EasyExcel;
import com.example.demo.listener.ReadConstractExcelListener;
import com.example.demo.ventity.ConstractExcel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    private  ReadConstractExcelListener rcel;

    @Test
    void contextLoads() {
        System.out.println("");
    	String filePath = "D:/ProjectFlies/template.xlsx";
        EasyExcel.read(filePath, ConstractExcel.class,rcel).sheet().doRead();
    }

}
