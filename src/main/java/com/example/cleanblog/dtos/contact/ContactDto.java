package com.example.cleanblog.dtos.contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String message;
}
