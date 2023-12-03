package com.pack.promer.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pack.promer.product.entity.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, String> {
	
//	@Query("SELECT p from ProductImage p where p.productEntity = ?1")
//	public List<ProductImage> getProdutImagesById(String productId);
}
