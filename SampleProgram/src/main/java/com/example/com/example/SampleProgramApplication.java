package com.example.com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class SampleProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleProgramApplication.class, args);
	}
	
	@RequestMapping("/")
	public String show() {
		System.out.println("Example");
		return "welcome";
	}
}
