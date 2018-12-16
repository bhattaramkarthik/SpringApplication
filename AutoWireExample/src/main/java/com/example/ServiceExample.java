package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceExample {

ExampleRepository exampleRepository;

@Autowired
public ServiceExample(ExampleRepository exampleRepository) {
	this.exampleRepository = exampleRepository;
}

	public String read() {
		System.out.println(exampleRepository.repositoryMethod());
		return "Service called";
	}
}
