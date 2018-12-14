package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.nutrinfomics.geneway.shared.testcategory.FastTest;

@Category(value = {FastTest.class})
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
