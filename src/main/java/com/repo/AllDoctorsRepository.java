package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.InDoctor;

public interface AllDoctorsRepository extends JpaRepository<InDoctor,Integer> {
	

	}


