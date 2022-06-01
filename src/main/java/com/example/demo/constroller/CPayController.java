package com.example.demo.constroller;

import com.example.demo.service.IPayService;
import com.example.demo.ventity.VPay;
import com.example.demo.ventity.VPayStatics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/pay")
public class CPayController {
    @Autowired
    private IPayService payService;

    @GetMapping("/list")
    public VPayStatics listByConstractId(int constractId) throws Exception {
        return this.payService.listByConstractId(constractId);
    }
}
