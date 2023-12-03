package com.pack.promer.product.dto;

import java.util.List;

import com.pack.promer.product.entity.ProductImage;

public interface ProductImageDto {
	public ProductImage createProdutImage(ProductImage productImage);
	public List<ProductImage> getAllProductImage();
}
