package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class ApiService2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiService2Application.class, args);
	}

}
