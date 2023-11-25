package com.pack.promer.user.service;

import java.util.List;

import com.pack.promer.user.entity.UserEntity;
import com.pack.promer.user.exception.UserNotFouneException;

public interface UserService {
	public UserEntity createUser(UserEntity user);
	public List<UserEntity> getAllUser();
	public UserEntity getUserByEmailId(String emailId) throws UserNotFouneException;
}
