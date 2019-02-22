package com.nutrinfomics.geneway.shared.specification;

import java.util.Vector;

import com.nutrinfomics.geneway.shared.FoodItemType;

public interface FoodPreferences {
  public boolean isDisliked(FoodItemType foodItemType);

  public boolean isLiked(FoodItemType foodItemType);

  public Vector<FoodSpecification> getSnackSpecification();
}
