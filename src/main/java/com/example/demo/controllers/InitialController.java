package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitialController {
    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/index.html")
    public String indexhtml(){
        return "index.html";
    }

    @GetMapping("about.html")
    public String about(){
        return "about.html";
    }

    @GetMapping("where.html")
    public String where(){
        return "where.html";
    }

    @GetMapping("contact.html")
    public String contact(){
        return "contact.html";
    }
}
