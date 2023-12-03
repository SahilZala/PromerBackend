package com.pack.promer.product.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class ProductImage {
	@Id
	private String id;
	private String title;
	private String url;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private ProductEntity productEntity;
	
}
