package com.pack.promer.product.service.impl;

import com.pack.promer.product.entity.ProductSize;
import com.pack.promer.product.repository.ProductSizeRepository;
import com.pack.promer.product.service.ProductSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducSizeServiceImpl implements ProductSizeService {

    @Autowired
    private ProductSizeRepository productSizeRepository;

    @Override
    public List<ProductSize> getAllProductSize() {
        return productSizeRepository.findAll();
    }
}
