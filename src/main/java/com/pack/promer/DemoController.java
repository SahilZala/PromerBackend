package com.pack.promer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/demo")
	public ResponseEntity<Object> demo()
	{
		return new ResponseEntity<>(new String("user demo"),HttpStatus.ACCEPTED);
	}
}
