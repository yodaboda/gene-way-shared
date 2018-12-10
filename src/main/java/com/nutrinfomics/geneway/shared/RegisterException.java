package com.nutrinfomics.geneway.shared;

public class RegisterException extends ActionException {
  /** */
  private static final long serialVersionUID = -8102596687032721729L;

  public enum RegisterExceptionType implements ExceptionType {
    USERNAME_EXISTS,
    EMAIL_EXISTS
  }

  public RegisterException(RegisterExceptionType type) {
    super(type);
  }
}
