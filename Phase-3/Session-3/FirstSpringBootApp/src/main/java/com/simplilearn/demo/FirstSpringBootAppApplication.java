package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")//controller location
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootAppApplication.class, args);
	}

}
