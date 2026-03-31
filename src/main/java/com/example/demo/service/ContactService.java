package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private JavaMailSender mailSender;

    public void saveAndSendEmail(Contact contact) {

        // Save to database
        contactRepository.save(contact);

        // Send email
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("yourgmail@gmail.com"); // YOUR EMAIL

        message.setSubject("New Contact Message");

        message.setText(
                "Name: " + contact.getName() +
                "\nEmail: " + contact.getEmail() +
                "\nMessage: " + contact.getMessage()
        );

        mailSender.send(message);
    }
}