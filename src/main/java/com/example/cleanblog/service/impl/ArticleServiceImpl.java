package com.example.cleanblog.service.impl;

import com.example.cleanblog.dtos.ArticleDetailDto;
import com.example.cleanblog.dtos.ArticleDto;
import com.example.cleanblog.repository.ArticleRepository;
import com.example.cleanblog.service.ArticleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final ModelMapper modelMapper;

    public ArticleServiceImpl(ArticleRepository articleRepository, ModelMapper modelMapper) {
        this.articleRepository = articleRepository;
        this.modelMapper = modelMapper;
    }



    @Override
    public List<ArticleDto> getAllArticles() {
        List<ArticleDto>articleDtoList=articleRepository.findAll().
                stream().map(article -> modelMapper.map(article, ArticleDto.class)).
                collect(Collectors.toList());
        return articleDtoList;
    }

    @Override
    public ArticleDetailDto getById(Long id) {
        return articleRepository.findById(id).map(article -> modelMapper.map(article,ArticleDetailDto.class)).orElseThrow();
    }
}
