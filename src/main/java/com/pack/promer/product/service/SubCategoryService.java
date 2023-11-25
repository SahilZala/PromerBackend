package com.pack.promer.product.service;

import java.util.List;

import com.pack.promer.product.entity.SubCategory;

public interface SubCategoryService {
	public SubCategory create(SubCategory subCategory);
	public List<SubCategory> getAll();
}
