package com.exception;

public class AgeIsLessThanException extends RuntimeException{
	public AgeIsLessThanException(String msg) {
		super(msg);
	}
}
