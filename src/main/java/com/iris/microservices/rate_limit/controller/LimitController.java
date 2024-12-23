package com.iris.microservices.rate_limit.controller;


import com.iris.microservices.rate_limit.bean.Limit;
import com.iris.microservices.rate_limit.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;


    @GetMapping("/limits")
    public Limit getLimits(){
        return new Limit(configuration.getMinimum(),configuration.getMaximum());
    }
}
