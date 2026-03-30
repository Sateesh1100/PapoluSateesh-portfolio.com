package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // HTML page open cheyadaniki
    @GetMapping("/contact-form")
    public String showContactForm() {

        return "contact"; // templates/contact.html open chestundi
    }
}