package com.example.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping("/iptest")
    @ResponseBody
    public String getIP(HttpServletRequest request){
        return request.getRemoteHost();
    }

}
