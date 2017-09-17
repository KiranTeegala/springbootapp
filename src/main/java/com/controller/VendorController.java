package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Vendor;
import com.service.VendorService;


@RestController
@RequestMapping("/vendor")
public class VendorController {
	
	private String filterValue;
	private String searchValue;
	@Autowired
	private  VendorService vendorService;
	@RequestMapping(value="/getAllVendors")
	public @ResponseBody List<Vendor> findAll() {
		List<Vendor> users=vendorService.findAllusers();
		for( Vendor ven: users){
	    	System.out.println(ven.getClient());
		}
		return users;
	}
	
	@RequestMapping("/getVendor")
	 @ResponseBody
	 public Vendor findById(@RequestParam("vendor_id") int vendorId){
		 	return vendorService.find(vendorId); 
	 }
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String update(@RequestBody Vendor vendor) {
		 
	    try {	    
	    	Vendor updatedVendor=vendorService.save(vendor);	      
    	
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "Updated Successfully ";
		
		
		
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/reg", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody
	public String register(@RequestBody Vendor vendor) {
		 
	    try {	    
	    	Vendor updatedVendor=vendorService.save(vendor);	      
    	
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "Registered Successfully ";
		
		
		
	}
	
	@RequestMapping("/deleteVendor")
	 @ResponseBody
	 public String deleteById(@RequestParam("vendor_id") int vendorId){
		try {	    
				vendorService.delete(vendorId);
    	
	    }
	    catch (Exception ex) {
	      return "Error deleting the vendor: " + ex.toString();
	    }
	    return "vendor deleted successfully ";
}
	@RequestMapping("/getCompany")
	@ResponseBody
	public List<String> getCompany()
	{
		List<String> companies = vendorService.getCompanies();
		
		return companies;
	}
	
	@RequestMapping("filterCompany")
	@ResponseBody
	public List<Vendor> filterCompany(@RequestParam("filterValue") String filterValue)
	{
		List<Vendor> vendors = vendorService.getVendorByCompanyName(filterValue);
		
		for(Vendor ven:vendors){
			System.out.println(ven.getPersonName());
			
		}
		
		return vendors;
	}
	
	@RequestMapping("search")
	@ResponseBody
	public List<Vendor> search(@RequestParam("searchValue") String searchValue)
	{
		System.out.println("search :"+searchValue);
//	int id=Integer.parseInt(searchValue);
//		System.out.println("id "+id);
		List<Vendor> filteredVendors = vendorService.searchByValue(searchValue);
		
		return filteredVendors;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/reg1", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String register1(@RequestBody Vendor vendor) {
		 System.out.println("In  Register 1");
	    try {	    
	    	Vendor updatedVendor=vendorService.save(vendor);	      
    	
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "Registered Successfully ";
		
		
		
	}
}
