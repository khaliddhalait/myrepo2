package com.cdac.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/display")
public class MyNameController {
	@GetMapping("/name")
	public String getEmployee() {
		try{
		}
		catch(Exception e){
		}
		String str = "my name is khalid";	
		return str;
	}
}
