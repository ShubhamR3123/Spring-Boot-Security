package com.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home(){

        return "This IS Home Page";
    }
    @GetMapping("/login.html")
    public String login(){

        return "This IS Login Page";
    }
    @GetMapping("/register")
    public String register(){

        return "This IS register Page";
    }

}
