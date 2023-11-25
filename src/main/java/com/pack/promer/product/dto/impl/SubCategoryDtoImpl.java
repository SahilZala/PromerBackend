package com.pack.promer.product.dto.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.product.dto.SubCategoryDto;
import com.pack.promer.product.entity.SubCategory;
import com.pack.promer.product.service.SubCategoryService;
import com.pack.promer.product.util.AppUtility;

@Service
public class SubCategoryDtoImpl implements SubCategoryDto{

	@Autowired
	SubCategoryService subCategoryService;
	
	@Override
	public SubCategory create(SubCategory subCategory) {
		subCategory.setId(AppUtility.getRandomeId());
		return subCategoryService.create(subCategory);
	}

	@Override
	public List<SubCategory> getAll() {
		return subCategoryService.getAll();
	}
	
}
