package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.alibaba.excel.EasyExcel;
import com.example.demo.listener.ReadConstractExcelListener;
import com.example.demo.ventity.ConstractExcel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.constroller.config.JWTConfig;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("123");
//    	String filePath = "C:/Users/rice/Desktop/表格.xlsx";
//        EasyExcel.read(filePath, ConstractExcel.class,new ReadConstractExcelListener()).sheet().doRead();
    }

}
