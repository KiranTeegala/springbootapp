package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.OutDoctor;
import com.repo.OutDoctorRepository;


@RestController
@RequestMapping("/ins")
public class OutDoctorController {
	@Autowired
	private OutDoctorRepository pr;
	

	
	@RequestMapping("/outdoctor")
	@ResponseBody
	 public List<OutDoctor> findall(){
		 	return pr.findAll();
	 }

}
