package com.pack.promer.user.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.promer.user.dao.UserDao;
import com.pack.promer.user.entity.Response;
import com.pack.promer.user.entity.UserEntity;
import com.pack.promer.user.util.APIPaths;

@RestController
public class GetUserByEmailId {
	
	@Autowired
	private UserDao userDao;
	
	
	@GetMapping(APIPaths.GET_USER_BY_EMAIL_ID)
	public ResponseEntity<Response> getUserEmailId(@RequestParam("emailId") String emailId)
	{
		System.out.println("email");
		UserEntity user = userDao.getUserByEmailId(emailId);
		return new ResponseEntity<>(new Response(HttpStatus.OK.value(),"",user),HttpStatus.OK); 
	}
	
}
