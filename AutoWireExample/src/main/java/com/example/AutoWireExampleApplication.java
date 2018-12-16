package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AutoWireExampleApplication {
    @Autowired
    ServiceExample serviceExample;
	public static void main(String[] args) {
		SpringApplication.run(AutoWireExampleApplication.class, args);
	}
	
	@RequestMapping("/home")
	public void show() {
		System.out.println(serviceExample.read());
	}
}
