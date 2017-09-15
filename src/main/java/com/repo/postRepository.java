package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.Patient;

@Repository
public interface postRepository extends CrudRepository<Patient, Integer> {

	//public Patient findById(int id);
	
}
