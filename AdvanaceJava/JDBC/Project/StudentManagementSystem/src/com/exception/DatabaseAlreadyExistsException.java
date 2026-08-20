package com.exception;

public class DatabaseAlreadyExistsException extends RuntimeException{
	
	public DatabaseAlreadyExistsException(String msg){
		super(msg);
	}
	
}
