package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BeanConfigurationApplication {

	@Autowired
	ServiceDemo serviceDemo;
	
	@Autowired
	ServiceProgram serviceProgram;
	
	public static void main(String[] args) {
		SpringApplication.run(BeanConfigurationApplication.class, args);
	}
	
	@RequestMapping("/view")
	@ResponseBody
	public String viewData() {
		System.out.println("View Data method...");
		return serviceDemo.returnValue();
	}
	
	@RequestMapping("/index")
	@ResponseBody
	public String indexValue() {
		System.out.println("indexValue method....");
		return serviceProgram.serviceMethod();
	}
}
