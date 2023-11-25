package com.pack.promer.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.product.entity.SubCategory;
import com.pack.promer.product.repository.SubCategoryRepository;
import com.pack.promer.product.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{

	@Autowired
	private SubCategoryRepository subCategoryRepo;
	
	@Override
	public SubCategory create(SubCategory subCategory) {
		
		return subCategoryRepo.save(subCategory);
	}

	@Override
	public List<SubCategory> getAll() {
		return subCategoryRepo.findAll();
	}
	

}
