package com.pack.promer.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.user.entity.AddressEntity;
import com.pack.promer.user.repository.AddressRepository;
import com.pack.promer.user.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepo;
	
	@Override
	public AddressEntity createAddressService(AddressEntity address) {
		return addressRepo.save(address);
	}
	
}
