package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	//request: localhost:8080/product/1
	@GetMapping("/product/{id}")
	public String getProducts(@PathVariable("id") String id) throws ProductNotFoundException {
		
		if(id.contentEquals("0"))
			throw new ProductNotFoundException("Not Valid ID");
		else
		   return "product found";
	}

}
