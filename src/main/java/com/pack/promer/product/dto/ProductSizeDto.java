package com.pack.promer.product.dto;

import com.pack.promer.product.entity.ProductSize;
import com.pack.promer.product.repository.ProductSizeRepository;

import java.util.List;

public interface ProductSizeDto {
    public List<ProductSize> getAllProductSize();

}
