package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;


import com.domain.InDoctor;
import com.repo.AllDoctorsRepository;
import com.repo.InDoctorRepository;

	@RestController
	@RequestMapping("/provider")
    public class InDoctorController {
		
		@Autowired
		private InDoctorRepository kr;

		@RequestMapping("/search")
		@ResponseBody
		 public List<InDoctor> findByName(@RequestParam("zipcode") String zipcode){
			 	return kr.find(zipcode);
		 }

}