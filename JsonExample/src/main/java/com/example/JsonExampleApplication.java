package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class JsonExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonExampleApplication.class, args);
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		SamplePojo samplePojo = new SamplePojo();
		ModelAndView model = new ModelAndView();
		List<String> citiesNames = new ArrayList<String>();
		citiesNames.add("Nellore");
		citiesNames.add("Chennai");
		citiesNames.add("Hyderabad");
		samplePojo.setName("karthik");
		samplePojo.setAge(15);
		samplePojo.setCities(citiesNames);
		model.setViewName("values.jsp");
		model.addObject(samplePojo);
		return model;
	}
}
