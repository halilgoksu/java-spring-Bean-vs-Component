package com.example.spring.is.here.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class SpringApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}

	@Bean
	public SecondClass getSecondClass(){
		return new SecondClass();
	}

	//http://localhost:8080/api/first-class
	//http://localhost:8080/api/second-class

}
