package com.exception;

public class InvalidEmailException extends RuntimeException{
	public InvalidEmailException(String msg) {
		super(msg);
	}
}
