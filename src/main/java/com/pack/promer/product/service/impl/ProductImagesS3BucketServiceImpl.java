package com.pack.promer.product.service.impl;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.pack.promer.product.service.ProductImagesS3BucketService;

@Service
public class ProductImagesS3BucketServiceImpl implements ProductImagesS3BucketService{


	@Value("${cloud.aws.credentials.access-key}")
	private	String accessKey;
	
	@Value("${cloud.aws.credentials.secret-key}")
	private String secretKey;
	
	@Value("${cloud.aws.region.static}")
	private String region;
	
	@Value("${cloud.aws.stack.auto}")
	private String auto;
	
	@Value("${cloud.aws.application.bucket.name}")
	private String bucketName;
	
	@Value("${cloud.aws.s3.endpoint}")
	private String endpoint;
	
	private static final Logger log = LoggerFactory.getLogger(ProductImagesS3BucketServiceImpl.class);
	
	private AmazonS3 s3client;
	
	{
		log.info("external block");
	}
	
	static {
		log.info("static block");
	}
	
	public ProductImagesS3BucketServiceImpl() {
		log.info("constructor call");
	}
	
	
	@PostConstruct
	private void initializeAmazon()
	{
		log.info("acess ky "+accessKey);
		log.info("secre "+secretKey);
		
		log.info("init block");
		AWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
		ClientConfiguration clientConfig = new ClientConfiguration();
		clientConfig.setProtocol(Protocol.HTTP);
		this.s3client = new AmazonS3Client(awsCreds,clientConfig);
	}
	
	@Override
	public List<String> uploadImages2S3Bucket(List<File> files) {
		return files.stream().map(
				f->{
						s3client.putObject(new PutObjectRequest(bucketName, f.getName(), f).withCannedAcl(CannedAccessControlList.PublicRead));
						return this.endpoint+""+this.bucketName+"/"+f.getName();
						
					}
				).collect(Collectors.toList());
	}

}
