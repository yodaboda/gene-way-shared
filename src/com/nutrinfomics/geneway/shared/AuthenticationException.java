package com.nutrinfomics.geneway.shared;

public class AuthenticationException extends ActionException {
	public enum AuthenticationExceptionType implements ExceptionType {INVALID_DEVICE_UUID, UNAUTHORIZED_DEVICE, INVALID_PASSWORD, INVALID_SESSION,
									EXPIRED}
		
	public AuthenticationException(AuthenticationExceptionType type){
		super(type);
	}
	
}
