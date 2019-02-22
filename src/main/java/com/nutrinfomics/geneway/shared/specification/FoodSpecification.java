package com.nutrinfomics.geneway.shared.specification;

import com.nutrinfomics.geneway.shared.FoodItemType;

public interface FoodSpecification {
  public boolean qualifies(FoodItemType foodItemType);
}
