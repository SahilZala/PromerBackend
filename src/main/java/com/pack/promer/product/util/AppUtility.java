package com.pack.promer.product.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.web.multipart.MultipartFile;

public class AppUtility {
	public static String getRandomeId()
	{
		return UUID.randomUUID().toString();
	}
	private AppUtility() {
		super();
		
	}
	public static File multipart2FileConverter(MultipartFile file) throws IOException
	{
		 File convFile = new File(file.getOriginalFilename());
		 return convFile;
	}
	
	public static List<File> multipleMultiart2FilesConverter(List<MultipartFile> files){
		
		return files.stream().map(f->{
			try {
				return multipart2FileConverter(f);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}).filter(f -> f != null).collect(Collectors.toList());
	}
}
