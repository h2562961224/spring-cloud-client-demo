package com.huxiaohui.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloViewController {
	@RequestMapping("/getHello/{message}")  
    public String web(Map<String,Object> model,@PathVariable String message){  
        model.put("time",new Date());  
        model.put("message",message);  
        return "hello";
    } 
}
