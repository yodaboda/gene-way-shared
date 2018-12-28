package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.nutrinfomics.geneway.shared.testcategory.FastTest;

@Category(value = { FastTest.class })
public class FieldVerifierTest {

	private FieldVerifier fieldVerifier = new FieldVerifier();

	@Test
	public void testIsValidNameTrue() {
		assertTrue(fieldVerifier.isValidName("abcd"));
	}

	@Test
	public void testIsValidNameFalse() {
		assertFalse(fieldVerifier.isValidName("ef"));
	}

	@Test
	public void testIsValidNameFalseNULL() {
		assertFalse(fieldVerifier.isValidName(null));
	}

	@Test
	public void testIsValidNameFalseEmpty() {
		assertFalse(fieldVerifier.isValidName(""));
	}
}
