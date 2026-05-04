package com.animesh.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // can use only controller ber will need a Welcome to Home page to return
public class homeController {

    @RequestMapping("/") // When someone calls the localhost:8080/ it will trigger
    // if you don't want to create a page then use @ResponseBody here
    public String greet(){
        return "Welcome to Home Page!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Fuck off we don't have an about page";
    }

}
