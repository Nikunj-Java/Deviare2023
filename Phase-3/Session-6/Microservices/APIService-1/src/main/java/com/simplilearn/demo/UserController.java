package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;

	//Calling SERVICE For CREATE METHOD
	@PostMapping("/")
	public ResponseEntity<User> addUser(@RequestBody User u){
		User user= service.addUser(u);
		
		if(user!=null)
			return new ResponseEntity<User>(user,HttpStatus.CREATED);
		else 
			return new ResponseEntity<User>(user,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	//CALLING GET USER SERVICE 
	@GetMapping("/")
	public  List<User> getAllUser(){
		return service.getAllUsers();
	}
	 
		 
		
		//get user by id
				@GetMapping("/{userId}")
				public ResponseEntity<Object> getUserById(@PathVariable int userId){
					  Response resp= service.getUserWithHobby(userId);
					  
					  if(resp!=null)
						  return new ResponseEntity<Object>(resp,HttpStatus.FOUND);
					  else
						  return new  ResponseEntity<Object>("No person Available",HttpStatus.NOT_FOUND);
				}
}
