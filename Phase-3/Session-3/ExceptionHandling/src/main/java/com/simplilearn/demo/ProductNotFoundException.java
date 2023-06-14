package com.simplilearn.demo;

import java.util.Arrays;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class ProductNotFoundException extends Exception {
	
	public ProductNotFoundException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [NOT FOUND WITH ID 0] ";
	}
	
	

}
