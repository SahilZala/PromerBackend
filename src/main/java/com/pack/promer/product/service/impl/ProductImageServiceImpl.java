package com.pack.promer.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.product.entity.ProductImage;
import com.pack.promer.product.repository.ProductImageRepository;
import com.pack.promer.product.service.ProductImageService;
import com.pack.promer.product.util.AppUtility;

@Service
public class ProductImageServiceImpl implements ProductImageService{
	
	@Autowired
	private ProductImageRepository productImageRepository;

	
	
	@Override
	public ProductImage createProductImage(ProductImage productImage) {
		
		productImage.setId(AppUtility.getRandomeId());
		return productImageRepository.save(productImage);
	}

	@Override
	public List<ProductImage> getAllProductImage() {
		return productImageRepository.findAll();
	}

	@Override
	public List<ProductImage> getProductImagesByProductId(String id) {
		return null;
	}

	@Override
	public void deleteProductImageById(ProductImage productImage) {
		this.productImageRepository.delete(productImage);
		
	}

}
