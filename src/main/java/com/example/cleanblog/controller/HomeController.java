package com.example.cleanblog.controller;


import com.example.cleanblog.dtos.ArticleDto;
import com.example.cleanblog.service.ArticleService;
import com.example.cleanblog.service.PageHeaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PageHeaderService pageHeaderService;
    private final ArticleService articleService;

    @GetMapping("/")
    public String index(Model model) {
        List<ArticleDto> articleDtoList = articleService.getAllArticles();
        model.addAttribute("articles", articleDtoList);
        return "index.html";
    }

    @GetMapping("/about")
    public String about() {
        return "about.html";
    }

    @GetMapping("/post")
    public String post() {
        return "post.html";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact.html";
    }
}

