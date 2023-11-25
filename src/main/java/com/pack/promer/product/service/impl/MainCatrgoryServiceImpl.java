package com.pack.promer.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.promer.product.entity.MainCategory;
import com.pack.promer.product.repository.MainCategoryRepository;
import com.pack.promer.product.service.MainCategoryService;

@Service
public class MainCatrgoryServiceImpl implements MainCategoryService {

	@Autowired
	private MainCategoryRepository mainCategoryRepo;
	
	@Override
	public MainCategory create(MainCategory mainCategory) {
		return mainCategoryRepo.save(mainCategory);
	}

	@Override
	public List<MainCategory> getAll() {
		return mainCategoryRepo.findAll();
	}
	
}
