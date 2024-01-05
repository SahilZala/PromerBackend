package com.pack.promer.product.service;

import java.util.List;

import com.pack.promer.product.entity.ProductEntity;

public interface ProductService {
	public ProductEntity create(ProductEntity product);
	public void deleteProductEntityById(ProductEntity id);
	public List<ProductEntity> getAll();
}
