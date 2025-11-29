package com.example.cleanblog.controller;

import com.example.cleanblog.service.PageHeaderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final PageHeaderService pageHeaderService;

    public HomeController(PageHeaderService pageHeaderService) {
        this.pageHeaderService = pageHeaderService;
    }

    @GetMapping("/")
    public String home(){
        return "index.html";
    }


    @GetMapping("/about")
    public String about(){
        return "about.html";
    }


    @GetMapping("/post")
    public String post(){
        return "post.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }

}
