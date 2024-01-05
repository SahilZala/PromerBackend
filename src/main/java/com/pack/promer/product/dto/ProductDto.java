package com.pack.promer.product.dto;

import java.util.List;

import com.pack.promer.product.entity.ProductEntity;

public interface ProductDto {
	public ProductEntity create(ProductEntity product);
	public List<ProductEntity> getAll();
	public void deleteProductEntityById(ProductEntity product);
}

