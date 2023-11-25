package com.pack.promer.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pack.promer.user.entity.Response;

@ControllerAdvice
public class GlobalExceptionHandler{
	
	
	@ExceptionHandler(UserNotFouneException.class)
	public ResponseEntity<Response> handleUserNotFoundException(UserNotFouneException ex)
	{
		return new ResponseEntity<>(new Response(HttpStatus.NOT_FOUND.value(),ex.getMessage(),ex.getMessage()),HttpStatus.NOT_FOUND);
	}
}
