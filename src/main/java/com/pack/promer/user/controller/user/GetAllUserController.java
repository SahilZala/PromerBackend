package com.pack.promer.user.controller.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.promer.user.dao.UserDao;
import com.pack.promer.user.entity.Response;
import com.pack.promer.user.util.APIPaths;

@RestController
public class GetAllUserController {
	
	@Autowired
	UserDao userDao;
	
	@GetMapping(APIPaths.GET_ALL_USERS)
	public ResponseEntity<Response> getAllUser()
	{
		return new ResponseEntity<>(new Response(HttpStatus.OK.value(),"",userDao.getAllUser()),HttpStatus.OK);
	}
}
