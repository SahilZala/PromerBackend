package com.pack.promer.product.service;

import java.util.List;

import com.pack.promer.product.entity.ProductImage;

public interface ProductImageService {
	public ProductImage createProductImage(ProductImage productImage);
	public List<ProductImage> getAllProductImage();
	public List<ProductImage> getProductImagesByProductId(String id);
	public void deleteProductImageById(ProductImage productImage);
}
