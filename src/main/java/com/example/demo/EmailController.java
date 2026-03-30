package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail() {

        emailService.sendEmail();

        return "Email sent successfully";
    }
}








//simple html,css meassage

//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class EmailController {
//
//    @Autowired
//    private EmailService emailService;
//
//    @GetMapping("/send-email")
//    public String sendEmail() {
//
//        emailService.sendEmail();
//
//        return "Email sent successfully";
//    }
//}





//text message

//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class EmailController {
//
//    @Autowired
//    private EmailService emailService;
//
//    @GetMapping("/send-email")
//    public String sendEmail() {
//
//        emailService.sendEmail();
//
//        return "Email sent successfully";
//    }
//}