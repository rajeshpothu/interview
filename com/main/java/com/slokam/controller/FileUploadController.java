package com.slokam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("fileupload")
public class FileUploadController {
	
	
@RequestMapping(value=("/fileupload"),method=RequestMethod.POST)	
public void fileUpload(MultipartFile multipartfile){
		
	System.out.println("iam in fileupload controller");
	String filename = multipartfile.getOriginalFilename();
	long size = multipartfile.getSize();
	
	System.out.println("filename"+filename);
	System.out.println("size"+size);
	
		
	}
	
	
	
	

}
