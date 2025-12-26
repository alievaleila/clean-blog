package com.example.cleanblog.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDetailDto {

    private Long id;
    private String content;
    private String title;
    private String subtitle;

}
