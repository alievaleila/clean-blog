package com.example.cleanblog.controller.dashboard;

import com.example.cleanblog.dtos.category.ContactDashDto;
import com.example.cleanblog.dtos.contact.ContactCreateDto;
import com.example.cleanblog.dtos.contact.ContactUpdateDto;
import com.example.cleanblog.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContactDashController {

    private final ContactService contactService;

    @GetMapping("/admin/contact")
    private String admin(Model model) {
        List<ContactDashDto> contactDashDtoList=contactService.getAllContacts();
        model.addAttribute("contacts",contactDashDtoList);
        return "/dashboard/contact/index";
    }

    @GetMapping("/admin/contact/create")
    private String create() {
        return "/dashboard/contact/create";
    }

    @PostMapping("/admin/contact/create")
    private String createContact(@ModelAttribute("contact")ContactCreateDto contactCreateDto){
        contactService.createContact(contactCreateDto);
        return "redirect:/admin/contact";
    }

    @GetMapping("/admin/contact/update/{id}")
    private String update(@PathVariable Long id,Model model) {
        ContactUpdateDto contactUpdateDto=contactService.getUpdatedContact(id);
        model.addAttribute("contact",contactUpdateDto);
        return "/dashboard/contact/update";
    }

    @PostMapping("/admin/contact/update/{id}")
    private String update(@ModelAttribute ContactUpdateDto contactUpdateDto,@PathVariable Long id){
        contactService.updateContact(contactUpdateDto,id);
        return "redirect:/admin/contact";
    }

    @GetMapping("/admin/contact/delete/{id}")
    private String delete(@PathVariable Long id, Model model) {
        return "/dashboard/contact/delete";
    }

}
