package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Autowired
	EProductDao dao;
	
	 
	@GetMapping("/listProducts")
	public String getAllProducts(ModelMap map) {
		
		List<EProductEntity> list= dao.getAllProducts();
		map.addAttribute("list",list);
		
		return "products";
	}

}
