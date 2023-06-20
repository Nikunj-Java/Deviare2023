package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hobby")
public class HobbyController {
	
	@Autowired
	HobbyService service;
	
	
	//create method to insert hobby
	
	@PostMapping("/")
	public ResponseEntity<Object> saveHobby(@RequestBody HobbyEntity hobby){
		HobbyEntity entity= service.saveHobby(hobby);
		
		if(entity!=null)
			return new ResponseEntity<Object>(entity, HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error While Inserting", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Object> getUserById(@PathVariable int userId){
		  String resp=service.findByUserId(userId);
		  
		  if(resp!=null)
			  return new ResponseEntity<Object>(resp,HttpStatus.FOUND);
		  else
			  return new  ResponseEntity<Object>("Hobby Not Available",HttpStatus.NOT_FOUND);
	}
	

}
