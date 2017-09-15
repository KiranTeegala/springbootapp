package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.dependent;


public interface Repository2 extends JpaRepository<dependent, Integer> {
	
	
	@Query("SELECT d FROM dependent d WHERE d.username = :username ")
    public List<dependent> find(@Param("username") String username);

}
