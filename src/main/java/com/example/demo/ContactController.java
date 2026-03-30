package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @PostMapping("/contact")
    public String saveContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(message);

        return "success";
    }
}