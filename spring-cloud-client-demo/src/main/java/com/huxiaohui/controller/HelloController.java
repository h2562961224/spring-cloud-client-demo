package com.huxiaohui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huxiaohui.properties.GlobalConfigProperties;

@RestController
public class HelloController {
	@Value("${neo.hello}")
    private String hello;
	
    @RequestMapping("/hello")
    public String from() {
        return GlobalConfigProperties.getHello();
    }
}
