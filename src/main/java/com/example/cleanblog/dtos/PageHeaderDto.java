package com.example.cleanblog.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageHeaderDto {
    private Long id;
    private String title;
    private String subtitle;
    private String backgroundImage;
    private String page;

}
