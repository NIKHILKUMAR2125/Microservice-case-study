package com.example.feignclientmicroservice.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "customer-service-2", url = "http://localhost:7001/customers/")
public interface FeignServiceCustomerUtil {

    @GetMapping("/customers")
    String getCustId();
}
