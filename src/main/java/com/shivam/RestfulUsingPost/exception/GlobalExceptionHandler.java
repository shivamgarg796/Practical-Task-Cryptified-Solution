package com.shivam.RestfulUsingPost.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = InvalidSortingOrderException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody String handleException(InvalidSortingOrderException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(value = InvalidArrayLengthrException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody String handleException(InvalidArrayLengthrException ex) {
		return ex.getMessage();
	}
}
