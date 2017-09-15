package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.dependent;
import com.domain.insurance;
import com.repo.Repository2;

@RestController
@RequestMapping("/dep")
public class dependentController {
	
	@Autowired
	private Repository2 rp;
	
	 @RequestMapping("/ins")
	 @ResponseBody
	 public List<dependent> findByName(@RequestParam("username") String username){
		 	return rp.find(username); 
	 }
	
	
	

}
