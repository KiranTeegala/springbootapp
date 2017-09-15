package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.InDoctor;
import com.domain.Visit;
import com.repo.VisitRepository;

@RestController
@RequestMapping("/visiter")

public class VisitController {
	
	@Autowired
	public VisitRepository vr;
	
	
	
	@RequestMapping("/all")
	 @ResponseBody
	 public List<Visit> findId(){
		 	
		List<Visit> list = vr.findById();
		 	
		 	return list;
	}

}



