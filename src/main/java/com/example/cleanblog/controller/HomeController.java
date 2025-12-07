package com.example.cleanblog.controller;


import com.example.cleanblog.dtos.ArticleDto;
import com.example.cleanblog.model.PageHeader;
import com.example.cleanblog.service.ArticleService;
import com.example.cleanblog.service.PageHeaderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final PageHeaderService pageHeaderService;
    private final ArticleService articleService;

    public HomeController(PageHeaderService pageHeaderService, ArticleService articleService) {
        this.pageHeaderService = pageHeaderService;
        this.articleService = articleService;
    }
//
//    @GetMapping("/")
//    public String index(Model model){
//        PageHeader pageHeader=pageHeaderService.getHeader("home");
//        model.addAttribute("header",pageHeader);
//        List<ArticleDto> getAllArticles= articleService.getAllArticles();
//        model.addAttribute("articles",getAllArticles);
//        return "index.html";
//    }
//
//
//    @GetMapping("/about")
//    public String about(Model model){
//        PageHeader pageHeader=pageHeaderService.getHeader("about");
//        model.addAttribute("header",pageHeader);
//        return "about.html";
//    }
//
//
//    @GetMapping("/post")
//    public String post(Model model){
//        PageHeader pageHeader=pageHeaderService.getHeader("post");
//        model.addAttribute("header",pageHeader);
//        return "post.html";
//    }
//
//    @GetMapping("/contact")
//    public String contact(Model model){
//        PageHeader pageHeader=pageHeaderService.getHeader("contact");
//        model.addAttribute("header",pageHeader);
//        return "contact.html";
//    }
//


    @GetMapping("/")
    public  String home(Model model){
        List<ArticleDto> getAllArticles= articleService.getAllArticles();
        model.addAttribute("article",getAllArticles);
        return "index.html";
    }

    @GetMapping("/about")
    public  String about(){
        return "about.html";
    }
    @GetMapping("/contact")
    public  String contact(){
        return "contact.html";
    }
    @GetMapping("/post")
    public  String post(){
        return "post.html";
    }
}
