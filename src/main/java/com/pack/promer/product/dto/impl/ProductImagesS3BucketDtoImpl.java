package com.pack.promer.product.dto.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.pack.promer.product.dto.ProductImagesS3BucketDto;
import com.pack.promer.product.service.ProductImagesS3BucketService;
import com.pack.promer.product.util.AppUtility;

@Service
public class ProductImagesS3BucketDtoImpl implements ProductImagesS3BucketDto {

	@Autowired
	private ProductImagesS3BucketService productService;
	
	
	private static final Logger log = LoggerFactory.getLogger(ProductImagesS3BucketDtoImpl.class);

	
	@Override
	public List<String> uploadImage(List<MultipartFile> files) {
		
		log.info("prodcuct image upload dto "+AppUtility.multipleMultiart2FilesConverter(files));
		
		return productService.uploadImages2S3Bucket(AppUtility.multipleMultiart2FilesConverter(files));
	}

}
