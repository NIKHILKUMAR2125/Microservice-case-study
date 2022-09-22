package com.example.feignclientmicroservice.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product-service-2", url = "http://localhost:7001/products/")
public interface FeignServiceProductUtil {

    @GetMapping("/Products")
    String getProdId();
}
