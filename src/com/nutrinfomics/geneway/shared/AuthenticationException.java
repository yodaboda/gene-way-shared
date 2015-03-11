package com.nutrinfomics.geneway.shared;

import java.io.Serializable;

public class AuthenticationException extends Exception implements Serializable {
	public enum AuthenticationExceptionType{INVALID_USERNAME, UNAUTHORIZED_DEVICE, INVALID_PASSWORD, INVALID_SESSION,
									EXPIRED}
	
	private AuthenticationExceptionType type;
	
	public AuthenticationException(){
		
	}
	
	public AuthenticationException(AuthenticationExceptionType type){
		this(type, "");
	}

	public AuthenticationException(AuthenticationExceptionType type, String message){
		super(message);
		this.setType(type);
	}
	
	public AuthenticationExceptionType getType() {
		return type;
	}

	public void setType(AuthenticationExceptionType type) {
		this.type = type;
	}
	
	@Override
	public String getMessage(){
		return type.toString();
	}
}
