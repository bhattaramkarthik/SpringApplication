package com.example;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepository {
  public String repositoryMethod() {
	  return "Repository Called";
  }
}
