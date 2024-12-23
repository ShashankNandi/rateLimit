package com.iris.microservices.rate_limit.controller;


import com.iris.microservices.rate_limit.bean.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {


    @GetMapping("/limits")
    public Limit getLimits(){
        return new Limit(1,999);
    }
}
