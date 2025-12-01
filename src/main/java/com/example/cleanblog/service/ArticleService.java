package com.example.cleanblog.service;

import com.example.cleanblog.dtos.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> getAllArticles();
}
