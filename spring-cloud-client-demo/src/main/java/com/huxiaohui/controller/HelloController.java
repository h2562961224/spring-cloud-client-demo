package com.huxiaohui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huxiaohui.properties.GlobalConfigProperties;

@RestController
public class HelloController {
	
	@Autowired
    private GlobalConfigProperties globalConfigProperties;
	
    @RequestMapping(value="/hello/{userName}",method=RequestMethod.GET)
    public String from(@PathVariable String userName,@RequestParam(required=false) String password) {
        return globalConfigProperties.getByebye()+" "+userName+" "+globalConfigProperties.getHello()+" "+password;
    }
}
