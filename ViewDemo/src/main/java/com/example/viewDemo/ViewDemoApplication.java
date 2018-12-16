package com.example.viewDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class ViewDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewDemoApplication.class, args);
	}
	
	@RequestMapping("/index")
	public String show() {
		System.out.println("Controller Started");
		return "show.jsp";
	}
}
