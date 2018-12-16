package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class SampleWebPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebPageApplication.class, args);
	}
	
	@RequestMapping("/index")
	public String samplePage() {
		return "index.jsp";
	}
	
	@RequestMapping("/submitForm")
	public ModelAndView details(@RequestParam String userName, @RequestParam String password) {
		System.out.println("Name: "+userName);
		System.out.println("password: "+password);
		Map<String,String> mapValues = new HashMap<String,String>();
		mapValues.put("name", userName);
		ModelAndView model = new ModelAndView("register.jsp",mapValues);
		return model;
	}
}
