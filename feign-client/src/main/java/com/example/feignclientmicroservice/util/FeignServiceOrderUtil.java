package com.example.feignclientmicroservice.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "order-service-2", url = "http://localhost:7003/orders/")
public interface FeignServiceOrderUtil {

    @GetMapping("/Orders")
    String getOrdId();
}
