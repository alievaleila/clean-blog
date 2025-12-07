package com.example.cleanblog.controller;

import com.example.cleanblog.dtos.ArticleDetailDto;
import com.example.cleanblog.model.PageHeader;
import com.example.cleanblog.service.ArticleService;
import com.example.cleanblog.service.PageHeaderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {
    private final ArticleService articleService;
    private final PageHeaderService pageHeaderService;

    public PostController(ArticleService articleService, PageHeaderService pageHeaderService) {
        this.articleService = articleService;
        this.pageHeaderService = pageHeaderService;
    }


    @GetMapping("/post/{id}")
    private String postDetail(@PathVariable Long id,Model model){
        ArticleDetailDto article=articleService.getById(id);
        model.addAttribute("article",article);
        PageHeader pageHeader = pageHeaderService.getHeader("post");
        model.addAttribute("header", pageHeader);

        return "post.html";
    }
}
