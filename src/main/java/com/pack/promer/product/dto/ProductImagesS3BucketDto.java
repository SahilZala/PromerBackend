package com.pack.promer.product.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface ProductImagesS3BucketDto {
	List<String> uploadImage(List<MultipartFile> files);
}
