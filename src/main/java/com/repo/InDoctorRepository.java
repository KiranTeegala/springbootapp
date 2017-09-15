package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.InDoctor;
import com.domain.dependent;
public interface InDoctorRepository extends JpaRepository<InDoctor,Integer>{

	
	@Query("SELECT z FROM InDoctor z WHERE z.zipcode = :zipcode ")
    public List<InDoctor> find(@Param("zipcode") String zipcode);
}
