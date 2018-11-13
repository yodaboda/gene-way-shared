package com.nutrinfomics.geneway.shared;


public class RegisterException extends ActionException {
	public enum RegisterExceptionType implements ExceptionType {USERNAME_EXISTS, EMAIL_EXISTS}

	
	public RegisterException(RegisterExceptionType type){
		super(type);
	}

}
