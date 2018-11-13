package com.nutrinfomics.geneway.shared;

import java.io.Serializable;

public class AuthenticationException extends Exception implements Serializable {
	public enum AuthenticationExceptionType{INVALID_DEVICE_UUID, UNAUTHORIZED_DEVICE, INVALID_PASSWORD, INVALID_SESSION,
									EXPIRED}
	
	private AuthenticationExceptionType type;
	
	public AuthenticationException(AuthenticationExceptionType type){
		super(type.toString());
		setType(type);
	}
	
	public AuthenticationExceptionType getType() {
		return type;
	}

	private void setType(AuthenticationExceptionType type) {
		this.type = type;
	}
}
