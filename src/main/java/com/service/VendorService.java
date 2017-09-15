package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Vendor;
import com.repo.VendorRepository;

@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	
	public List<Vendor> findAllusers(){
		
		List<Vendor> vendors = (List<Vendor>) vendorRepository.findAll();
		return vendors;
	}
	
	public Vendor find(int vendor_id){
		Vendor vendor = vendorRepository.find(vendor_id);
		return vendor;
	}
	
	public Vendor save(Vendor vendor){
	Vendor vendor1=vendorRepository.save(vendor);
		return vendor1;
	}
	
	public void delete(int vendor_id){
		vendorRepository.delete(vendor_id);
	}
	
	public List<String> getCompanies()
	{
		return vendorRepository.getCompanies();
	}
	
	public List<Vendor> getVendorByCompanyName(String vendorCompany)
	{
		return vendorRepository.getVendorbyCompany(vendorCompany);
	}
	
	public List<Vendor> searchByValue(String searchValue){
		System.out.println("Service search :"+searchValue);
		List<Vendor> vendors= vendorRepository.searchByValue(searchValue.toLowerCase());
		
		return vendors;
//		List<Vendor> filteredVendors = new ArrayList<Vendor>();
//		for(Vendor ven : vendors){
//			if((ven.getPersonName().toLowerCase().contains(searchValue.toLowerCase()))|| (ven.getClient().toLowerCase().contains(searchValue.toLowerCase()))
//					||(ven.getPosition_location().toLowerCase().contains(searchValue.toLowerCase())||
//					(ven.getPosition_title().toLowerCase().contains(searchValue.toLowerCase()))|| (ven.getSubmitted_by().toLowerCase().contains(searchValue.toLowerCase())))
//					|| (ven.getSubmitted_status().toLowerCase().contains(searchValue.toLowerCase()))||(ven.getVendorCompanyName().toLowerCase().contains(searchValue.toLowerCase()))
//					|| (ven.getPhone().contains(searchValue))
//					)
//			{
//				filteredVendors.add(ven);
//			}
//			
//			
//		}
//		return filteredVendors;
	}
}
