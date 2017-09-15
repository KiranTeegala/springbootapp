package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.PatientDAO;
import com.IDAO.IPatientDAO;
import com.domain.Patient;
import com.domain.insurance;
import com.repo.PatientRepository;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientRepository patientDAO;
	
//	@Autowired
//	private PatientDAO patientDAO;
//
//	@RequestMapping("/{id}")
//	 @ResponseBody
//	 public Patient findById(@PathVariable("id") int id){
//		 	return patientDAO.fetchPatientById(id);	 
//	 }
	
	@RequestMapping("/login")
	 @ResponseBody
	 public Patient findByName(@RequestParam("username") String username,@RequestParam("password") String password){
		 	return patientDAO.find(username,password); 
	 }

}
