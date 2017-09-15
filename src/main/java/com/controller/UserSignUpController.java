package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.UserSignup;
import com.service.UserSignUpService;

@Controller
@RequestMapping("/user")
public class UserSignUpController {
	
	 @Autowired
	 private UserSignUpService usersignupService;
	 
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	 
	@ResponseBody
	public String create(@RequestBody UserSignup patient) {
		
	    try {	    
	    	usersignupService.save(patient);	      
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "Enrolled Successfully ";
		
		
	  }
	

}