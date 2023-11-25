package com.pack.promer.product.dto;

import java.util.List;

import com.pack.promer.product.entity.MainCategory;

public interface MainCategoryDto {
	public MainCategory create(MainCategory mainCategory);
	public List<MainCategory> getAll();
}
