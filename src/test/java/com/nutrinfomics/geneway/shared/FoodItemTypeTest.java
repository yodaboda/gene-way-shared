package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoodItemTypeTest {

  @Test
  public void testGetFoodCategoryAlmond() {
    assertEquals(FoodCategory.NUT, FoodItemType.ALMOND.getFoodCategory());
  }

  @Test
  public void testGetFoodCategoryHoney() {
    assertNotEquals(FoodCategory.MEAT, FoodItemType.HONEY.getFoodCategory());
  }
}
