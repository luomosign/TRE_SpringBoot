package com.neusoft.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping({"/","/index.html"})
    public String index(){
        return "login";//springmvc  逻辑视图 web-inf/login.jsp
    }

    @RequestMapping("/thymeleaf")
    public  String success(Map<String,Object> map)
    {
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        map.put("hello","helloworld");
        return "success";
    }
}
