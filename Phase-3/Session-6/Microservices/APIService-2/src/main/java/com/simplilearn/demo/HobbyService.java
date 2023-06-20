package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {
	
	@Autowired
	HobbyRepository repo;
	
	
	//save the hobby
	public HobbyEntity saveHobby(HobbyEntity hobby) {
		return repo.save(hobby);
	}
	
	
	//find findByUserId
	
	public String findByUserId(int userId) {
		return repo.findByUserId(userId);
	}
	

}
