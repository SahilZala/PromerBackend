package com.pack.promer.user.controller.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.promer.user.dao.AddressDao;
import com.pack.promer.user.entity.AddressEntity;
import com.pack.promer.user.entity.Response;
import com.pack.promer.user.util.APIPaths;

@RestController
public class CreateAddressController {
	
	@Autowired
	private AddressDao addressDao;
	
	@PostMapping(APIPaths.CREATE_ADDRESS)
	public ResponseEntity<Response> createAddress(@RequestBody AddressEntity address)
	{
		return new ResponseEntity<>(new Response(HttpStatus.OK.value(),"",addressDao.createAddress(address)),HttpStatus.OK);
	}
}
