package com.example.cleanblog.service.impl;

import com.example.cleanblog.model.PageHeader;
import com.example.cleanblog.repository.PageHeaderRepository;
import com.example.cleanblog.service.PageHeaderService;
import org.springframework.stereotype.Service;

@Service
public class PageHeaderServiceImpl implements PageHeaderService {
    private final PageHeaderRepository pageHeaderRepository;

    public PageHeaderServiceImpl(PageHeaderRepository pageHeaderRepository) {
        this.pageHeaderRepository = pageHeaderRepository;
    }

    @Override
    public PageHeader getHeader(String name) {

        return null;
    }
}
