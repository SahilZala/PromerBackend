package com.pack.promer.product.controller.product;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pack.promer.product.dto.ProductDto;
import com.pack.promer.product.dto.ProductImageDto;
import com.pack.promer.product.dto.ProductImagesS3BucketDto;
import com.pack.promer.product.entity.ProductEntity;
import com.pack.promer.product.entity.ProductImage;
import com.pack.promer.product.util.APIPaths;
import com.pack.promer.user.entity.Response;

@RestController
@CrossOrigin("*")
public class ProductController {
	
	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductDto productDto;
	
	@Autowired
	private ProductImageDto productImageDto;
	
	@PostMapping(APIPaths.CREATE_PRODUCT)
	public ResponseEntity<ProductEntity> create(@RequestBody ProductEntity productEntity)
	{
		log.info(productEntity.toString());
		log.info(productEntity.getProductVariant().getSize().toString());
		return new ResponseEntity<>(productDto.create(productEntity),HttpStatus.OK);
	}
	
	@GetMapping(APIPaths.GET_ALL_PRODUCT)
	public ResponseEntity<List<ProductEntity>> getAll()
	{
		return new ResponseEntity<>(productDto.getAll(),HttpStatus.OK);
	}
	
	@PostMapping(APIPaths.UPLOAD_IMAGES)
	@CrossOrigin
	public ResponseEntity<?> upload(@RequestBody List<ProductImage> url)
	{
		log.info(""+url);
		
		url.forEach((product) -> {
			productImageDto.createProdutImage(product);
		});
		
		return new ResponseEntity<>(url,HttpStatus.OK);
	}
	
	@PostMapping(APIPaths.DELETE_PRODUCT)
	@CrossOrigin
	public ResponseEntity<?> deleteEntireProuct(@RequestBody ProductEntity product)
	{
		productDto.deleteProductEntityById(product);
		return new ResponseEntity<>(new Response(HttpStatus.OK.value(),"deleted successfully.",null),HttpStatus.OK);
	}
}
