package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.*;

import org.junit.Test;

public class FieldVerifierTest {

	@Test
	public void testIsValidNameTrue() {
		assertTrue(FieldVerifier.isValidName("abcd"));
	}
	
	@Test
	public void testIsValidNameFalse() {
		assertFalse(FieldVerifier.isValidName("ef"));
	}

	@Test
	public void testIsValidNameFalseNULL() {
		assertFalse(FieldVerifier.isValidName(null));
	}

	@Test
	public void testIsValidNameFalseEmpty() {
		assertFalse(FieldVerifier.isValidName(""));
	}

}
