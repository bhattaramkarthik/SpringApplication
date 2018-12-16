package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

	  @Bean
	  public ServiceDemo serviceDemo() {
		  return new ServiceDemo();
	  }
	  
	  @Bean
	  public ServiceProgram serviceProgram() {
		  return new ServiceProgram();
	  }
	  
	  @Bean
	  public RepositoryProgram repositoryProgram() {
		  return new RepositoryProgram();
	  }
}
