package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.Patient;
import com.domain.insurance;

public interface Repository extends JpaRepository<insurance, Integer> {

	//insurance findByMembershipType(String membership_type);
	 
//   public List<insurance> findall();

	//insurance findOne();
	@Query("SELECT i FROM insurance i WHERE i.membershipType = :membershipType AND i.metallic_type = :metallic_type")
    public insurance find(@Param("membershipType") String membershipType,@Param("metallic_type") String metallic_type);

	
}
