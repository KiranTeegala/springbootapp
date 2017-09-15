package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import com.repo.reportRepository;

import com.domain.report;

@Service
public class reportService {
	
	@Autowired
    private reportRepository reportRepository;
	
	public report save(report report){
        return reportRepository.save(report);
    }

}
