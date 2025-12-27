package com.example.cleanblog.service;

import com.example.cleanblog.dtos.contact.ContactCreateDto;
import com.example.cleanblog.dtos.contact.ContactDto;
import com.example.cleanblog.dtos.category.ContactDashDto;
import com.example.cleanblog.dtos.contact.ContactUpdateDto;

import java.util.List;

public interface ContactService {

    void addContact(ContactDto contactDto);

    List<ContactDashDto> getAllContacts();

    void createContact(ContactCreateDto contactCreateDto);

    ContactUpdateDto getUpdatedContact(Long id);

    void updateContact(ContactUpdateDto contactUpdateDto, Long id);
}
