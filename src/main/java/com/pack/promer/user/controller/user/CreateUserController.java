package com.pack.promer.user.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.promer.user.dao.UserDao;
import com.pack.promer.user.entity.Response;
import com.pack.promer.user.entity.UserEntity;
import com.pack.promer.user.util.APIPaths;

@RestController
public class CreateUserController {
	
	@Autowired
	UserDao userDao;

	@PostMapping(APIPaths.CREATE_USER)
	public ResponseEntity<Response> createUserController(@RequestBody UserEntity user){
		return new ResponseEntity<>(new Response(HttpStatus.OK.value(),"",userDao.createUser(user)),HttpStatus.OK);
	}
}
