package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.Visit;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
	@Query("SELECT d FROM Visit d ")
    public List<Visit> findById();
}
