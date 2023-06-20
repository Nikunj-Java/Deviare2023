package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	
	//add Method or CREATE RECORD Method
	public User addUser(User u) {
		return repo.save(u);
	}
	
	
	//get Method or RETRIVE RECORD Method
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}

	
	//create method for get user by id--5 min
			
	
	//create method for delete user by id--5  min
	
	
	//create method for update user by id--5 min
}
