package com.nutrinfomics.geneway.shared;

import java.io.Serializable;

import com.nutrinfomics.geneway.shared.AuthenticationException.AuthenticationExceptionType;

public class ActionException extends Exception implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2721774147421559337L;
	private ExceptionType exceptionType;
	
	public ActionException(ExceptionType exceptionType){
		super(exceptionType.toString());
		setType(exceptionType);
	}
	
	public ExceptionType getType() {
		return exceptionType;
	}

	private void setType(ExceptionType exceptionType) {
		this.exceptionType = exceptionType;
	}
	
}
