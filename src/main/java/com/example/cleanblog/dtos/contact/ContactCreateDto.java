package com.example.cleanblog.dtos.contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactCreateDto {

    private String name;
    private String email;
    private String phone;
    private String message;
}

