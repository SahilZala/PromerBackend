package com.pack.promer.product.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.promer.product.entity.ProductEntity;
import com.pack.promer.product.repository.ProductRepository;
import com.pack.promer.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepo;
	
	@Override
	public ProductEntity create(ProductEntity product) {
		return productRepo.save(product);
	}

	@Override
	public List<ProductEntity> getAll() {
		return productRepo.findAll();
	}
	
}
