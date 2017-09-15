package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.claims;
import com.repo.claimsRepository;

@RestController
@RequestMapping("/patient")
public class claimsController {
	
	@Autowired private claimsRepository cr;
	
	@RequestMapping("/claims")
	@ResponseBody
	public List<claims> findByName(@RequestParam("id") int id){
	 	return cr.find(id); 
 }

}
