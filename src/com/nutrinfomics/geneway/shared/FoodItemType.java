package com.nutrinfomics.geneway.shared;



public enum FoodItemType {
	//fruits:
	//spring fruits:
	APRICOT(FoodCategory.FRUIT),
	//summer fruits:
	FIG(FoodCategory.FRUIT), PLUM(FoodCategory.FRUIT), GRAPE(FoodCategory.FRUIT), WATERMELON(FoodCategory.FRUIT), 
	MANGO(FoodCategory.FRUIT), PRICKLY_PEAR(FoodCategory.FRUIT), CANTALOUPE(FoodCategory.FRUIT), BANANA(FoodCategory.FRUIT), 
	PEACH(FoodCategory.FRUIT), PINEAPPLE(FoodCategory.FRUIT),MULBERRIES(FoodCategory.FRUIT),
	//Autumn fruits:
	GRAPEFRUIT(FoodCategory.FRUIT), KIWI(FoodCategory.FRUIT), PASSIONFRUIT(FoodCategory.FRUIT), APPLE(FoodCategory.FRUIT), APPLE_PEELED(FoodCategory.FRUIT),
	POMEGRANATE(FoodCategory.FRUIT), POMEGRANATE_JUICE(FoodCategory.FRUIT), PEAR(FoodCategory.FRUIT),
	DATE(FoodCategory.FRUIT), AVOCADO(FoodCategory.FRUIT), OLIVE(FoodCategory.FRUIT),
	LEMON_JUICE(FoodCategory.FRUIT), GUAVA(FoodCategory.FRUIT), DATE_YELLOW(FoodCategory.FRUIT),
	TANGERINES(FoodCategory.FRUIT), ORANGE(FoodCategory.FRUIT), ORANGE_JUICE(FoodCategory.FRUIT),
	PUMMELO(FoodCategory.FRUIT), PERSIMMON_JAPANESE(FoodCategory.FRUIT),
	CRANBERRIES(FoodCategory.FRUIT), BLUEBERRIES(FoodCategory.FRUIT), BLACKBERRIES(FoodCategory.FRUIT),
	//winter fruits
	STRAWBERRIES(FoodCategory.FRUIT),
	//year round
	TOMATO(FoodCategory.VEGETABLE_FRUIT), CUCUMBER_PEELED(FoodCategory.VEGETABLE_FRUIT), ZUCCHINI(FoodCategory.VEGETABLE_FRUIT), PEPPERS_RED(FoodCategory.VEGETABLE_FRUIT),
	PEPPERS_YELLOW(FoodCategory.VEGETABLE_FRUIT),
	PUMPKIN(FoodCategory.VEGETABLE_FRUIT), SQUASH_SUMMER(FoodCategory.VEGETABLE_FRUIT), EGGPLANT(FoodCategory.VEGETABLE_FRUIT),
	//dried fruits
	FIG_DRIED(FoodCategory.FRUIT), APRICOT_DRIED(FoodCategory.FRUIT), PLUM_DRIED(FoodCategory.FRUIT),RAISIN(FoodCategory.FRUIT),
	//foods from animal source
	//land animals
	LAMB(FoodCategory.MEAT), LAMB_LIVER(FoodCategory.MEAT), LAMB_BRAIN(FoodCategory.MEAT), LAMB_TONGUE(FoodCategory.MEAT), LAMB_SPLEEN(FoodCategory.MEAT),
	BEEF(FoodCategory.MEAT), BEEF_TENDERLOIN(FoodCategory.MEAT), BEEF_LIVER(FoodCategory.MEAT),
	PORK(FoodCategory.MEAT), PORK_FEET(FoodCategory.MEAT),
	CHICKEN_DRUMSTICK(FoodCategory.MEAT), CHICKEN(FoodCategory.MEAT), CHICKEN_LIVER(FoodCategory.MEAT), CHICKEN_LEG(FoodCategory.MEAT),
	GOAT(FoodCategory.MEAT), 
	TURKEY(FoodCategory.MEAT),
	//diary
	CHEESE_FETA(FoodCategory.DAIRY), MILK1P(FoodCategory.DAIRY), YOGURT_GREEK(FoodCategory.DAIRY),
	CHEESE_COTTAGE(FoodCategory.DAIRY),BUTTER(FoodCategory.DAIRY),
	//water animals
	SALMON(FoodCategory.FISH), OYSTER(FoodCategory.SEAFOOD), CRAB(FoodCategory.SEAFOOD), OCTOPUS(FoodCategory.SEAFOOD),
	SQUID(FoodCategory.SEAFOOD), SHRIMP(FoodCategory.SEAFOOD), GROUPER(FoodCategory.FISH), GILT_HEAD_BREAM(FoodCategory.FISH),
	TUNA_CANNED(FoodCategory.FISH),
	
	EGG_YOLK(FoodCategory.EGG), EGG(FoodCategory.EGG), EGG_WHITE(FoodCategory.EGG),
	//roots
	CARROT(FoodCategory.ROOT), CARROT_JUICE(FoodCategory.ROOT), POTATO(FoodCategory.ROOT), SWEET_POTATO(FoodCategory.ROOT), GARLIC(FoodCategory.ROOT),
	TURNIP(FoodCategory.ROOT), RADISH(FoodCategory.ROOT),
	//nuts
	WALNUT(FoodCategory.NUT), ALMOND(FoodCategory.NUT), HAZELNUT(FoodCategory.NUT), BRAZILNUT(FoodCategory.NUT), COCONUT(FoodCategory.NUT),
	COCONUT_DESICCATED(FoodCategory.NUT), COCONUT_FLOUR(FoodCategory.NUT), CHOCOLATE(FoodCategory.NUT), CHOCOLATE_DARK_70_85(FoodCategory.NUT),
	//oils
	OLIVE_OIL(FoodCategory.OIL), COCONUT_OIL(FoodCategory.OIL),
	HONEY(FoodCategory.OTHER),
	//vegetable
	JUTE(FoodCategory.VEGETABLE), OKRA(FoodCategory.VEGETABLE), SPINACH(FoodCategory.VEGETABLE), PARSLEY(FoodCategory.VEGETABLE),
	LAVER(FoodCategory.VEGETABLE), KELP(FoodCategory.VEGETABLE), WAKAME(FoodCategory.VEGETABLE),
	LETTUCE(FoodCategory.VEGETABLE), ARUGULA(FoodCategory.VEGETABLE), BROCCOLI(FoodCategory.VEGETABLE),
	SPEARMINT(FoodCategory.VEGETABLE), ONION_YOUNG_GREEN(FoodCategory.VEGETABLE), CABBAGE(FoodCategory.VEGETABLE),
	ARTICHOKE(FoodCategory.VEGETABLE), CAULIFLOWER(FoodCategory.VEGETABLE), 
	//cereals
	BULGUR(FoodCategory.CEREAL), RICE(FoodCategory.CEREAL),
	//legume
	CHICKPEA(FoodCategory.LEGUME), BROADBEAN(FoodCategory.LEGUME), LENTIL(FoodCategory.LEGUME), BEAN_SNAP_YELLOW(FoodCategory.LEGUME),
	//spices
	COFFEE_INSTANT(FoodCategory.SPICE), TURMERIC(FoodCategory.SPICE), THYME(FoodCategory.SPICE),
	//baked
	PITA_WHITE(FoodCategory.BAKED),
	CHOCOLATE_CAKE(FoodCategory.COMPOSITE), ROCK_CAKE(FoodCategory.COMPOSITE);
	private FoodCategory foodCategory;
	
	FoodItemType(FoodCategory foodCategory){
		this.foodCategory = foodCategory;
	}
	
	public FoodCategory getFoodCategory(){
		return foodCategory;
	}

}
