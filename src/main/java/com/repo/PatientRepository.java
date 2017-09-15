package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.domain.Patient;
import com.domain.insurance;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

	Patient findById(int id);
	
	@Query("SELECT p FROM Patient p WHERE p.username = :username AND p.password = :password")
    public Patient find(@Param("username") String username,@Param("password") String password);

}
