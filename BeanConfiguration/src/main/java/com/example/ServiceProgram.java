package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceProgram {

	@Autowired
	private RepositoryProgram repositoryProgram;
	
	private String value = "Karthik";
	
	public String serviceMethod() {
		System.out.println("service program class...");
		System.out.println(repositoryProgram.repositoryMethod());
		System.out.println(value);
		return "Service Program";
	}
	
}
