package com.pack.promer.product.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class MainCategory {
	
	@Id
	private String id;
	private String title;
	
	@OneToMany(cascade = CascadeType.PERSIST,mappedBy = "mainCategory")
	private List<SubCategory> subCategory;
	
	
}
