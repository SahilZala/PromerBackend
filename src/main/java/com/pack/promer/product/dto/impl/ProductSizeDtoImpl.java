package com.pack.promer.product.dto.impl;

import com.pack.promer.product.dto.ProductSizeDto;
import com.pack.promer.product.entity.ProductSize;
import com.pack.promer.product.service.ProductSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSizeDtoImpl implements ProductSizeDto {

    @Autowired
    private ProductSizeService productSizeService;

    @Override
    public List<ProductSize> getAllProductSize() {
        return productSizeService.getAllProductSize();
    }
}
