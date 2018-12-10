package com.nutrinfomics.geneway.shared;

/** FieldVerifier validates that the name the user enters is valid. */
public class FieldVerifier {

  /**
   * Verifies that the specified name is valid for our service.
   *
   * @param name the name to validate
   * @return true if name length is greater than 3 characters
   */
  public static boolean isValidName(String name) {
    if (name == null) {
      return false;
    }
    return name.length() > 3;
  }
}
