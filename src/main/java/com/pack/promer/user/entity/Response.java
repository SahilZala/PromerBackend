package com.pack.promer.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Response {
	private int stausCode;
	private String message;
	private Object body;	
}
