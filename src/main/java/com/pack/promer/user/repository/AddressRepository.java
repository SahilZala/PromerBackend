package com.pack.promer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.promer.user.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, String>{
	
}
