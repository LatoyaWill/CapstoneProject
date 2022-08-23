package com.usk.capstone.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionController {

/*	@ExceptionHandler(value = AuthenticationFailException.class)
	public final ResponseEntity<String> handleAuthenticationException(AuthenticationFailException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}*/
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public final ResponseEntity<String> handleAuthenticationException(ProductNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
