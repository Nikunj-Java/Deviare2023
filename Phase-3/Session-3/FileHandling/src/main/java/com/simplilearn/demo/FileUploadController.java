package com.simplilearn.demo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	
	String msg="";
	
	 
	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		
		try {
			
			byte[] bytes= file.getBytes();
			Path path=Paths.get("D://files//"+file.getOriginalFilename());
			
			//method to write the files
			Files.write(path, bytes);
			msg="File Uploaded Successfully";
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg="Error Occured "+e.getMessage();
		}
		
		return msg;
		
	}
	
	
}
