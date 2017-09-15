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

import com.domain.Patient;
import com.service.PatientService;

@Controller
@RequestMapping("/patient")
public class postController {
	
	 @Autowired
	 private PatientService patientService;
	 
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	 
	@ResponseBody
	public String create(@RequestBody Patient patient) {
		 //String userId = "";
	    try {	    
	    	patientService.save(patient);	      
    	//userId = String.valueOf(patient.getId());
   	
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "Enrolled Successfully ";
		
		/*patientRepository.save(patient);
        return patient.getId().toString();*/
			
	  }
	

}
