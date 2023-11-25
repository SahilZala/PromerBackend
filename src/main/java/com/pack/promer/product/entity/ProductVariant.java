package com.pack.promer.product.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductVariant {
	private String gender;
	@OneToOne
	private ProductSize size;
	private String color;
	@OneToOne
	private MainCategory mainCategory;
	@OneToOne
	private SubCategory subCategory;
	
//	private int netQuantity;
}
