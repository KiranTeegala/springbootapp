package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.InDoctor;
import com.repo.AllDoctorsRepository;

@RestController
@RequestMapping("/provider")
public class AllDoctorsController {
	@Autowired
	private AllDoctorsRepository ad;
	@RequestMapping("/all")
	@ResponseBody
	 public List<InDoctor> findAll()
	{
		 	return ad.findAll();
	 }

}
