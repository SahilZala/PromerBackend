package com.pack.promer.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor

@NoArgsConstructor
public class SubCategory {
	
	@Id
	@Getter
	@Setter
	private String id;
	@Getter
	@Setter
	private String title;
	
	@JoinColumn(name = "main_category")
	@ManyToOne
	@Setter
	private MainCategory mainCategory;

	
	
	
}
