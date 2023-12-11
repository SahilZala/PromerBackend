package com.pack.promer.product.controller.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.promer.product.dto.SubCategoryDto;
import com.pack.promer.product.entity.SubCategory;
import com.pack.promer.product.util.APIPaths;

@RestController
@CrossOrigin
public class SubCategoryController {

	@Autowired
	private SubCategoryDto subCategoryDto;
	
	@PostMapping(APIPaths.CREATE_SUB_CATEGORY)
	public ResponseEntity<SubCategory> create(@RequestBody SubCategory subCategory)
	{
		return new ResponseEntity<>(subCategoryDto.create(subCategory),HttpStatus.OK);
	}
	
	@GetMapping(APIPaths.GET_ALL_SUB_CATEGORY)
	public ResponseEntity<List<SubCategory>> getAll()
	{
		return new ResponseEntity<>(subCategoryDto.getAll(),HttpStatus.OK);
	}
}
