package com.pack.promer.product.dto.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.product.dto.ProductDto;
import com.pack.promer.product.entity.ProductEntity;
import com.pack.promer.product.repository.ProductRepository;
import com.pack.promer.product.util.AppUtility;

@Service
public class ProductDtoImpl implements ProductDto {

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public ProductEntity create(ProductEntity product) {
		product.setId(AppUtility.getRandomeId());
		return productRepo.save(product);
	}

	@Override
	public List<ProductEntity> getAll() {
		return productRepo.findAll();
	}

	
}
