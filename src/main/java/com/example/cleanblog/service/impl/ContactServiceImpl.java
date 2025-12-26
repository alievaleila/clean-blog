package com.example.cleanblog.service.impl;

import com.example.cleanblog.dtos.contact.ContactCreateDto;
import com.example.cleanblog.dtos.contact.ContactDto;
import com.example.cleanblog.dtos.category.ContactDashDto;
import com.example.cleanblog.dtos.contact.ContactUpdateDto;
import com.example.cleanblog.model.Contact;
import com.example.cleanblog.repository.ContactRepository;
import com.example.cleanblog.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addContact(ContactDto contactDto) {
        Contact contact = new Contact();
        contact.setName(contactDto.getName());
        contact.setEmail(contactDto.getEmail());
        contact.setMessage(contactDto.getMessage());
        contact.setPhone(contactDto.getPhone());

        contactRepository.save(contact);
    }

    @Override
    public List<ContactDashDto> getAllContacts() {
        List<ContactDashDto>contactDashDtoList=contactRepository.findAll()
                .stream()
                .map(contact -> modelMapper.map(contact, ContactDashDto.class))
                .collect(Collectors.toList());
        return contactDashDtoList;
    }

    @Override
    public void createContact(ContactCreateDto contactCreateDto) {
        Contact contact = new Contact();
        contact.setName(contactCreateDto.getName());
        contact.setEmail(contactCreateDto.getEmail());
        contact.setMessage(contactCreateDto.getMessage());
        contact.setPhone(contactCreateDto.getPhone());

        contactRepository.save(contact);
    }

    @Override
    public ContactUpdateDto updateContact(Long id) {
        Contact contact=contactRepository.findById(id).orElseThrow();
        ContactUpdateDto contactUpdateDto=modelMapper.map(contact,ContactUpdateDto.class);
        return contactUpdateDto;
    }
}
