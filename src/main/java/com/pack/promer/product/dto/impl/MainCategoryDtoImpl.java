package com.pack.promer.product.dto.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.product.dto.MainCategoryDto;
import com.pack.promer.product.entity.MainCategory;
import com.pack.promer.product.service.MainCategoryService;
import com.pack.promer.product.util.AppUtility;

@Service
public class MainCategoryDtoImpl implements MainCategoryDto {
	
	@Autowired
	private MainCategoryService mainCategoryService;
	
	
	@Override
	public MainCategory create(MainCategory mainCategory) {
		mainCategory.setId(AppUtility.getRandomeId());
		return mainCategoryService.create(mainCategory);
	}

	@Override
	public List<MainCategory> getAll() {
		return mainCategoryService.getAll();
	}
	
}
