package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.claims;

public interface claimsRepository extends JpaRepository<claims, Integer>{
	
	@Query("SELECT c FROM claims c WHERE c.id = :id")
    public List<claims> find(@Param("id") int id);

	

}
