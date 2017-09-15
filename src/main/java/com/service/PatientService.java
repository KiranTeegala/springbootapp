package com.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.repo.postRepository;
import com.domain.Patient;
import com.repo.postRepository;


@Service
public class PatientService {

	@Autowired
    private postRepository postRepository;
	
	public Patient save(Patient patient){
        return postRepository.save(patient);
    }
	
	
	
	/*public Patient findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	
}
