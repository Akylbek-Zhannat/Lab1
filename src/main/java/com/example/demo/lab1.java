package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class lab1 {
    @RequestMapping("/")
    @ResponseBody
    public String  greet(){
        return "Hi Teacher";
    }
    @RequestMapping("/Hello world")
    @ResponseBody
    public String  greet1(){
        return "Hello World";
    }

}
