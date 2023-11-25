package com.pack.promer.product.service;

import java.io.File;
import java.util.List;


public interface ProductImagesS3BucketService {
	
	List<String> uploadImages2S3Bucket(List<File> files);
}
