package com.pack.promer.product.service;

import java.util.List;

import com.pack.promer.product.entity.MainCategory;

public interface MainCategoryService {
	public MainCategory create(MainCategory mainCategory);
	public List<MainCategory> getAll();
}
