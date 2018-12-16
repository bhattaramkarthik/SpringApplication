package com.example.mailDemo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MailDemoApplication {
	
	@Autowired
    private JavaMailSender sender;

	public static void main(String[] args) {
		SpringApplication.run(MailDemoApplication.class, args);
	}
	
	@RequestMapping("/send")
	public String sendMail() throws MailException {
		System.out.println("Send Mail method Started");
		 MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);

	        try {
	            helper.setTo("bhattaramkarthik@gmail.com");
	            helper.setText("<html><body><h1>Welcome</h1></body></html>", true);
	            helper.setSubject("Mail From Spring Boot");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            return "Error while sending mail ..";
	        }
	        sender.send(message);
		return "Mail Sent Successfully...";
	}
}
