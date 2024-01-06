package com.mkchoi.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/Index")
    public String Index(){
        return "Hello World!!";
    }
}
