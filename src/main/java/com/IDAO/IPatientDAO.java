package com.IDAO;
import java.util.List;

import com.domain.Patient;
public interface IPatientDAO {
	
//boolean addProduct(Product product);
	Patient fetchPatientById(int id);
	List<Patient> fetchPatients();
//	boolean deleteProduct(int id);
//	boolean updateProduct(Product product);
//	float fetchMaxPrice();
//	void addProduct(List<Product> products);


}
