package com.pack.promer.product.dto;

import java.util.List;

import com.pack.promer.product.entity.SubCategory;

public interface SubCategoryDto {
	public SubCategory create(SubCategory subCategory);
	public List<SubCategory> getAll();
}
