//html ,css ,formss
package com.example.demo;

/*
EmailService Class

Purpose:
--------
HTML email send cheyadaniki use chestam.
Ikkada online picture (image link) use chestunnam.

Important:
----------
helper.setText(html, true);
true ante HTML content ani meaning.
*/

import jakarta.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

@Autowired
private JavaMailSender mailSender;

public void sendEmail() {

    try {

        // MimeMessage create
        MimeMessage message =
                mailSender.createMimeMessage();

        // Helper create
        MimeMessageHelper helper =
                new MimeMessageHelper(message, true);

        // Receiver email (mee email ivvali)
//        helper.setTo("naidusatish737@gmail.com");
        helper.setTo("rajmorark@gmail.com");

        // Subject
        helper.setSubject("My Java Full Stack Learning");

        // HTML + ONLINE IMAGE
        String html =
                "<html>" +
                "<body style='font-family:Arial'>" +

                "<h2 style='color:blue'>Hi Bro</h2>" +

                "<p>I am learning <b>Java Full Stack</b>.</p>" +

                "<p>This email is sent from my Spring Boot application.</p>" +

                // ONLINE PICTURE
                "<img src='https://www.w3schools.com/html/img_girl.jpg' "
                + "width='200' height='200'>" +

                "<br><br>" +

                "<p style='color:green'>Thank you!</p>" +

                "</body>" +
                "</html>";

        // HTML send
        helper.setText(html, true);

        // Send email
        mailSender.send(message);

        System.out.println("Email sent successfully");

    } catch (Exception e) {

        System.out.println("Error sending email");
        e.printStackTrace();
    }
}
}






////simple html,css meassage
//
//
//package com.example.demo;
//import jakarta.mail.internet.MimeMessage;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public void sendEmail() {
//
//        try {
//
//            MimeMessage message =
//                    mailSender.createMimeMessage();
//
//            MimeMessageHelper helper =
//                    new MimeMessageHelper(message, true);
//
//            // Ikkada receiver email ivvali
//            helper.setTo("naidusatish737@gmail.com");
//
//            helper.setSubject("Learning Java Full Stack");
//
//            String html =
//                    "<html>" +
//                    "<body style='font-family:Arial'>" +
//                    "<h2 style='color:blue'>Hi Bro</h2>" +
//                    "<p>I am learning <b>Java Full Stack</b>.</p>" +
//                    "<p>This email is sent from my Spring Boot application.</p>" +
//                    "<p style='color:green'>Thank you!</p>" +
//                    "</body>" +
//                    "</html>";
//
//            helper.setText(html, true);
//
//            mailSender.send(message);
//
//            System.out.println("Email sent successfully");
//
//        } catch (Exception e) {
//
//            System.out.println("Error sending email");
//            e.printStackTrace();
//        }
//    }
//}
//

//Just Text only 



//package com.example.demo; 
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public void sendEmail() {
//
//        SimpleMailMessage message =
//                new SimpleMailMessage();
//
//       
//        message.setTo("naidusatish737@gmail.com");
//
//        message.setSubject("Test Email");
//
//        message.setText("Hello buddy, Spring Boot email working!");
//
//        mailSender.send(message);
//    }
//}
//
//
//
//
//
//
//
////package com.example.demo;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.mail.SimpleMailMessage;
////import org.springframework.mail.javamail.JavaMailSender;
////import org.springframework.stereotype.Service;
////
////@Service
////public class EmailService {
////
////    @Autowired
////    private JavaMailSender mailSender;
////
////    public void sendEmail() {
////
////        SimpleMailMessage message =
////                new SimpleMailMessage();
////
////        message.setTo("receiver@gmail.com"); // ikkada mee email ivvachu
////        message.setSubject("Test Email");
////        message.setText("Hello buddy, Spring Boot email working!");
////
////        mailSender.send(message);
////    }
////}