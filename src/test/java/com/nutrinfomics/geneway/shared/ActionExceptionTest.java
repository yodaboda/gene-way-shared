package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nutrinfomics.geneway.shared.AuthenticationException.AuthenticationExceptionType;


public class ActionExceptionTest {

	@Test
	public void testGetType() {
		ActionException ae = new ActionException(AuthenticationExceptionType.INVALID_PASSWORD);
		assertEquals(AuthenticationExceptionType.INVALID_PASSWORD, ae.getType());
	}

	@Test
	public void testGetMessage() {
		AuthenticationException ae = new AuthenticationException(AuthenticationExceptionType.UNAUTHORIZED_DEVICE);
		assertEquals(AuthenticationExceptionType.UNAUTHORIZED_DEVICE.toString(), ae.getMessage());
	}
}