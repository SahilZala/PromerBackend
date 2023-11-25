package com.pack.promer.product.controller.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pack.promer.product.dto.MainCategoryDto;
import com.pack.promer.product.entity.MainCategory;
import com.pack.promer.product.util.APIPaths;

@RestController
@CrossOrigin
public class MainCategoryController {

	@Autowired
	private MainCategoryDto mainCategoryDto;
	
	@PostMapping(APIPaths.CREATE_MAIN_CATEGORY)
	public ResponseEntity<MainCategory> create(@RequestBody MainCategory mainCategory)
	{
		return new ResponseEntity<>(mainCategoryDto.create(mainCategory),HttpStatus.OK);
	}
	
	@GetMapping(APIPaths.GET_ALL_MAIN_CATEGORY)
	public ResponseEntity<List<MainCategory>> getAll()
	{
		return new ResponseEntity<>(mainCategoryDto.getAll(),HttpStatus.OK);
	}
	
}
