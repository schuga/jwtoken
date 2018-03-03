package com.jwto.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author suior
 *
 */



@RestController
public class RController {
	
	@RequestMapping( method = RequestMethod.GET, value="/salam")
	@CrossOrigin(origins = "http://localhost:8080")
	public String getString() {
		
		return "Hello world";
	}
	

}

