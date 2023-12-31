package com.simplilearn.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/details")
	public String getProduct(HttpServletRequest request,ModelMap map) {
		long id=Long.parseLong(request.getParameter("id"));
		EProductEntity entity=dao.getProductById(id);
		map.addAttribute("obj",entity);
		return "details";
	}

}
