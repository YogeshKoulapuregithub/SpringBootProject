package com.jsp.springboot.Actor.exception;

public class actorNotFoundById extends RuntimeException {
       private String message;

	public actorNotFoundById(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
       
}
