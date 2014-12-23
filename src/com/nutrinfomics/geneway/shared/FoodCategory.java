package com.nutrinfomics.geneway.shared;

public enum FoodCategory {
	MEAT, VEGETABLE_FRUIT, FISH, SEAFOOD, FRUIT, NUT, OIL, DAIRY, EGG, ROOT, LEGUME, VEGETABLE, CEREAL, OTHER, BAKED, SPICE, COMPOSITE, SPROUT, FUNGUS;
	
	public static boolean isAnimal(FoodCategory foodCategory){
		return foodCategory == MEAT || foodCategory == FISH || foodCategory == SEAFOOD;
	}
	
	public static boolean isEgg(FoodCategory foodCategory){
		return foodCategory == EGG;
	}
}
