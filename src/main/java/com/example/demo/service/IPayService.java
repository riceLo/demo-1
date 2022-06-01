package com.example.demo.service;

import com.example.demo.ventity.VPay;
import com.example.demo.ventity.VPayStatics;

import java.util.List;

public interface IPayService {
    public VPayStatics listByConstractId(int constractId) throws Exception;
}
