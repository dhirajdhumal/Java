package com.exception;

public class ProductAlreadyUpdatedException extends RuntimeException{
	public ProductAlreadyUpdatedException(String msg) {
		super(msg);
	}
}
