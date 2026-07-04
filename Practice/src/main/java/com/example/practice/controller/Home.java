package com.example.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World !!! ";
    }

    @RequestMapping("/login")
    public String login(){
        return "This is the Login Page.";
    }

}
