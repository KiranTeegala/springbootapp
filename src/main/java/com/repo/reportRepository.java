package com.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.report;

@Repository
public interface reportRepository extends CrudRepository<report, Integer>{

}
