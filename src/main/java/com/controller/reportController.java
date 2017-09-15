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


import com.domain.report;

import com.service.reportService;

@Controller
@RequestMapping("/claims")

public class reportController {
	
	 @Autowired
	 private reportService reportService;
	 
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/report", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	 
	@ResponseBody
	public String create(@RequestBody report report) {
		 
	    try {	
	    	System.out.println(report);
	    	reportService.save(report);	
	    	
    
   	
	    }
	    catch (Exception ex) {
	      return "Error reporting the claim: " + ex.toString();
	    }
	    return "Error reported successfully ";
		
		
	  }

}
