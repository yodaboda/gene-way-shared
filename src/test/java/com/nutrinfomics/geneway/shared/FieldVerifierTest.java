package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.nutrinfomics.geneway.shared.testcategory.FastTest;

@Category(value = {FastTest.class})
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
