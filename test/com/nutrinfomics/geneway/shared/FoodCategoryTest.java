package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoodCategoryTest {

	@Test
	public void testIsAnimalMeat() {
		assertTrue(FoodCategory.isAnimal(FoodCategory.MEAT));
	}

	@Test
	public void testIsAnimalFish() {
		assertTrue(FoodCategory.isAnimal(FoodCategory.FISH));
	}

	@Test
	public void testIsAnimalSeafood() {
		assertTrue(FoodCategory.isAnimal(FoodCategory.SEAFOOD));
	}

	@Test
	public void testIsAnimalNut() {
		assertFalse(FoodCategory.isAnimal(FoodCategory.NUT));
	}
	
	@Test
	public void testIsEgg() {
		assertTrue(FoodCategory.isEgg(FoodCategory.EGG));
	}

	@Test
	public void testIsEggDairy() {
		assertFalse(FoodCategory.isEgg(FoodCategory.DAIRY));
	}

	
}
