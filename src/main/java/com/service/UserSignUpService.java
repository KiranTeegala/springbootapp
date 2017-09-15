package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.UserSignup;
import com.repo.UserSignUpRepository;

@Service
public class UserSignUpService {

	@Autowired
	private UserSignUpRepository userSignUpRepository;
	
	public UserSignup save(UserSignup user)
	{
		return userSignUpRepository.save(user);
	}
}
