package com.nutrinfomics.geneway.shared;

public class AuthenticationException extends ActionException {
  /** */
  private static final long serialVersionUID = 7490336895780451467L;

  public enum AuthenticationExceptionType implements ExceptionType {
    INVALID_DEVICE_UUID,
    UNAUTHORIZED_DEVICE,
    INVALID_PASSWORD,
    INVALID_SESSION,
    EXPIRED
  }

  public AuthenticationException(AuthenticationExceptionType type) {
    super(type);
  }
}
