package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String home() {

        return "index";

    }

    @PostMapping("/contact")
    public String saveContact(
            @ModelAttribute Contact contact) {

        contactService.saveAndSendEmail(contact);

        return "success";

    }

}