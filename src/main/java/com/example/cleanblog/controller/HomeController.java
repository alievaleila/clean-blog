package com.example.cleanblog.controller;


import com.example.cleanblog.model.PageHeader;
import com.example.cleanblog.service.PageHeaderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final PageHeaderService pageHeaderService;

    public HomeController(PageHeaderService pageHeaderService) {
        this.pageHeaderService = pageHeaderService;
    }

    @GetMapping("/")
    public String index(Model model){
        PageHeader pageHeader=pageHeaderService.getHeader("home");
        model.addAttribute("header",pageHeader);
        return "index.html";
    }


    @GetMapping("/about")
    public String about(Model model){
        PageHeader pageHeader=pageHeaderService.getHeader("about");
        model.addAttribute("header",pageHeader);
        return "about.html";
    }


    @GetMapping("/post")
    public String post(Model model){
        PageHeader pageHeader=pageHeaderService.getHeader("post");
        model.addAttribute("header",pageHeader);
        return "post.html";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        PageHeader pageHeader=pageHeaderService.getHeader("contact");
        model.addAttribute("header",pageHeader);
        return "contact.html";
    }


}
