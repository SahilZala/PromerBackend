package com.pack.promer.product.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductEntity {
	
	@Id
	private String id;
	private ProductDetails productDetails;
	private ProductPricing productPricing;
	private ProductVariant productVariant;
//	private ProductInventory productInventory;
	private ProductOrganization productOrganization;
	private boolean activation;
	
	@Transient
	private List<ProductImage> productImages;
	
}

