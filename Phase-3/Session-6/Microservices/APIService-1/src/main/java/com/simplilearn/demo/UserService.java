package com.simplilearn.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	private RestTemplate template= new RestTemplate();
	
	
	//add Method or CREATE RECORD Method
	public User addUser(User u) {
		return repo.save(u);
	}
	
	
	//get Method or RETRIVE RECORD Method
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}

	
	 
		
//BINDING MICRO SERVICE -2 FROM API SERVICE-2
		
	public Response getUserWithHobby(int userId) {
			
			final String url="http://localhost:8081/hobby/{userId}";
			Map<String, Integer>map=new HashMap<String, Integer>();
			map.put("userId", userId);
			
			String hobby= template.getForObject(url, String.class,map);
			
			
			User entity= repo.findById(userId).get();
			Response resp= new Response();
			resp.setEntity(entity);
			resp.setHobby(hobby);
			
			return resp;
		}
}
