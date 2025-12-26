package com.example.cleanblog.dtos.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDashDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String message;
}
