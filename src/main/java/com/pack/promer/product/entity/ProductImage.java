package com.pack.promer.product.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductImage {
	@Getter
	@Id
	private String id;
	@Getter
	private String title;
	@Getter
	private String url;
	
	@JoinColumn(name = "product_entity_id")
	@ManyToOne(cascade = CascadeType.REMOVE)
	private ProductEntity productEntity;
	
}
