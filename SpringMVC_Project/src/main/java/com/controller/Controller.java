package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(path="/Controller")
public class Controller {
    @RequestMapping(path = "/sayHello")
    public String sayHello() throws ArithmeticException {
        System.out.println("控制器方法执行...");
        return "success" ;
    }
}
