package com.example.testmq.controller;

import com.example.testmq.cus.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        customerService.custom();
        return "ok";
    }
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "ok";
    }
}
