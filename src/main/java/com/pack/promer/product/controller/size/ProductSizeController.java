package com.pack.promer.product.controller.size;

import com.pack.promer.product.dto.ProductSizeDto;
import com.pack.promer.product.entity.ProductSize;
import com.pack.promer.product.util.APIPaths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProductSizeController {

    @Autowired
    private ProductSizeDto productSizeDto;

    @GetMapping(APIPaths.GET_ALL_PRODUCT_SIZE)
    public ResponseEntity<List<ProductSize>> getAllProductSize(){
        return new ResponseEntity<>(productSizeDto.getAllProductSize(), HttpStatus.OK);
    }
}
