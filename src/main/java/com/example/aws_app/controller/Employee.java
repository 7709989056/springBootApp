package com.example.aws_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {

    @GetMapping("/greet")
    public String message(){
        return "First AWS application!!";
    }

    @GetMapping("/post")
    public String message1(){
        return "First Docker Jenkin application!!";
    }
}
