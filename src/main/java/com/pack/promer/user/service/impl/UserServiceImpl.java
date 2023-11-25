package com.pack.promer.user.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.user.entity.UserEntity;
import com.pack.promer.user.exception.UserNotFouneException;
import com.pack.promer.user.repository.UserRepository;
import com.pack.promer.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	
	@Override
	public UserEntity createUser(UserEntity user) {
		return userRepo.save(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		
		return userRepo.findAll();
	}

	@Override
	public UserEntity getUserByEmailId(String emailId) throws RuntimeException {
		UserEntity user = userRepo.findUserByEmailId(emailId);
		
		if(user == null)
			throw new UserNotFouneException("User not found with given email Id");
		log.info(user.toString());

		return user;
	}	
}
