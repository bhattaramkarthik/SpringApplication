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
public class DemoWebApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
	
	@RequestMapping("/index")
	public String index() {
		return "registration.jsp";
	}
	
	@RequestMapping("/submitData")
	public ModelAndView submitData(@RequestParam String userName, @RequestParam String password) {
		ModelAndView modelAndView = new ModelAndView();
		if(userName.equals("karthik") && password.equals("12345")) {
			Map<String,String> valuesMap = new HashMap<String,String>();
			valuesMap.put("name", userName);
			valuesMap.put("lastName", "Bhattaram");
			modelAndView.setViewName("success.jsp");
			modelAndView.addAllObjects(valuesMap);
			return modelAndView;
		}else {
			modelAndView.setViewName("failure.jsp");
			return modelAndView;
		}
	}
}
