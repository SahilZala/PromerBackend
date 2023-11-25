package com.pack.promer.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.user.dao.UserDao;
import com.pack.promer.user.entity.UserEntity;
import com.pack.promer.user.service.UserService;
import com.pack.promer.user.util.AppUtility;

@Service
public class UserDaoImpl implements UserDao{

	@Autowired
	UserService userService;
	
	@Override
	public UserEntity createUser(UserEntity user) {
		user.setId(AppUtility.getRandomeId());
		return userService.createUser(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		return userService.getAllUser();
	}

	@Override
	public UserEntity getUserByEmailId(String emailId) {
		return userService.getUserByEmailId(emailId);
	}
}
