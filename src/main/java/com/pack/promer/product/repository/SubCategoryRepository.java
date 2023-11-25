package com.pack.promer.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.promer.product.entity.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, String> {

}
