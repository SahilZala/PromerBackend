package com.pack.promer.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.promer.product.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
