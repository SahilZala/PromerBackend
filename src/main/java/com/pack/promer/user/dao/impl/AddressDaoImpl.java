package com.pack.promer.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.user.dao.AddressDao;
import com.pack.promer.user.entity.AddressEntity;
import com.pack.promer.user.service.AddressService;
import com.pack.promer.user.util.AppUtility;

@Service
public class AddressDaoImpl implements AddressDao {

	@Autowired
	AddressService addressService;
	
	@Override
	public AddressEntity createAddress(AddressEntity address) {
		
		address.setId(AppUtility.getRandomeId());
		return addressService.createAddressService(address);
	}
	
	
}
