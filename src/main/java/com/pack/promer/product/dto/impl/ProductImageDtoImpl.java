package com.pack.promer.product.dto.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.product.dto.ProductImageDto;
import com.pack.promer.product.entity.ProductImage;
import com.pack.promer.product.service.ProductImageService;

@Service
public class ProductImageDtoImpl implements ProductImageDto {

	@Autowired
	private ProductImageService productImageService;
	
	@Override
	public ProductImage createProdutImage(ProductImage productImage) {
		return productImageService.createProductImage(productImage);
	}

	@Override
	public List<ProductImage> getAllProductImage() {
		return productImageService.getAllProductImage();
	}

}
