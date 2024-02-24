package com.jsp.springboot.Actor.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.springboot.Actor.exception.actorNotFoundById;

@RestControllerAdvice
public class ApplicationHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> actorNotFoundByIdException(actorNotFoundById ex)
	{
		ErrorStructure<String> errorStructure=new ErrorStructure<>();
		errorStructure.setStetusCode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrormessage(ex.getMessage());
		errorStructure.setErrorData("Actor Object With the given id doesnt exist..!!");
		
		return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
	}

}
