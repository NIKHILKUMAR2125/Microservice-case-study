package com.example.feignclientmicroservice.controller;

import com.example.feignclientmicroservice.util.FeignServiceCustomerUtil;
import com.example.feignclientmicroservice.util.FeignServiceOrderUtil;
import com.example.feignclientmicroservice.util.FeignServiceProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignServiceOrderUtil feignServiceOrderUtil;
    @GetMapping("/Orders")
    public String getOrdId(){
        return feignServiceOrderUtil.getOrdId();
    }


    @Autowired
    private FeignServiceProductUtil feignServiceProductUtil;
    @GetMapping("/Products")
    public String getProdId(){
        return feignServiceProductUtil.getProdId();
    }


    @Autowired
    private FeignServiceCustomerUtil feignServiceCustomerUtil;
    @GetMapping("/Customers")
    public String getCstId(){
        return feignServiceCustomerUtil.getCustId();
    }


}
