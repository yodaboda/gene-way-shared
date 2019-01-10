/*
 * Copyright 2019 Firas Swidan†
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.nutrinfomics.geneway.shared;

public enum FoodItemType {
  // fruits:
  // spring fruits:
  APRICOT(FoodCategory.FRUIT),
  LOQUATS(FoodCategory.FRUIT),
  CHERRIES(FoodCategory.FRUIT),
  // summer fruits:
  FIG(FoodCategory.FRUIT),
  PLUM(FoodCategory.FRUIT),
  GRAPE(FoodCategory.FRUIT),
  WATERMELON(FoodCategory.FRUIT),
  MANGO(FoodCategory.FRUIT),
  PRICKLY_PEAR(FoodCategory.FRUIT),
  CANTALOUPE(FoodCategory.FRUIT),
  BANANA(FoodCategory.FRUIT),
  PEACH(FoodCategory.FRUIT),
  PINEAPPLE(FoodCategory.FRUIT),
  PAPAYA(FoodCategory.FRUIT),
  MULBERRIES(FoodCategory.FRUIT),
  // Autumn fruits:
  GRAPEFRUIT(FoodCategory.FRUIT),
  KIWI(FoodCategory.FRUIT),
  PASSIONFRUIT(FoodCategory.FRUIT),
  APPLE(FoodCategory.FRUIT),
  APPLE_PEELED(FoodCategory.FRUIT),
  POMEGRANATE(FoodCategory.FRUIT),
  POMEGRANATE_JUICE(FoodCategory.FRUIT),
  PEAR(FoodCategory.FRUIT),
  DATE(FoodCategory.FRUIT),
  AVOCADO(FoodCategory.FRUIT),
  OLIVE(FoodCategory.FRUIT),
  LEMON_JUICE(FoodCategory.FRUIT),
  LEMON(FoodCategory.FRUIT),
  GUAVA(FoodCategory.FRUIT),
  DATE_YELLOW(FoodCategory.FRUIT),
  TANGERINES(FoodCategory.FRUIT),
  ORANGE(FoodCategory.FRUIT),
  ORANGE_JUICE(FoodCategory.FRUIT),
  PUMMELO(FoodCategory.FRUIT),
  PERSIMMON_JAPANESE(FoodCategory.FRUIT),
  CRANBERRIES(FoodCategory.FRUIT),
  BLUEBERRIES(FoodCategory.FRUIT),
  BLACKBERRIES(FoodCategory.FRUIT),
  // winter fruits
  STRAWBERRIES(FoodCategory.FRUIT),
  // year round
  TOMATO(FoodCategory.VEGETABLE_FRUIT),
  ARMENIAN_CUCUMBER(FoodCategory.VEGETABLE_FRUIT),
  CUCUMBER_PEELED(FoodCategory.VEGETABLE_FRUIT),
  ZUCCHINI(FoodCategory.VEGETABLE_FRUIT),
  PEPPERS_RED(FoodCategory.VEGETABLE_FRUIT),
  PEPPERS_YELLOW(FoodCategory.VEGETABLE_FRUIT),
  PEPPERS_GREEN(FoodCategory.VEGETABLE_FRUIT),
  PUMPKIN(FoodCategory.VEGETABLE_FRUIT),
  SQUASH_SUMMER(FoodCategory.VEGETABLE_FRUIT),
  EGGPLANT(FoodCategory.VEGETABLE_FRUIT),
  // dried fruits
  FIG_DRIED(FoodCategory.FRUIT),
  APRICOT_DRIED(FoodCategory.FRUIT),
  PLUM_DRIED(FoodCategory.FRUIT),
  RAISIN(FoodCategory.FRUIT),
  // foods from animal source
  // land animals
  LAMB(FoodCategory.MEAT),
  LAMB_LEG_SIRLOIN(FoodCategory.MEAT),
  LAMB_LIVER(FoodCategory.MEAT),
  LAMB_BRAIN(FoodCategory.MEAT),
  LAMB_TONGUE(FoodCategory.MEAT),
  LAMB_SPLEEN(FoodCategory.MEAT),
  LAMB_HEART(FoodCategory.MEAT),
  BEEF(FoodCategory.MEAT),
  BEEF_TENDERLOIN(FoodCategory.MEAT),
  BEEF_SIRLOIN(FoodCategory.MEAT),
  BEEF_RIB(FoodCategory.MEAT),
  BEEF_CHUCK_EYE_STEAK(FoodCategory.MEAT),
  BEEF_LIVER(FoodCategory.MEAT),
  BEEF_HEART_NZ(FoodCategory.MEAT),
  OXTAIL(FoodCategory.MEAT),
  PORK(FoodCategory.MEAT),
  PORK_FEET(FoodCategory.MEAT),
  PORK_FEET_PICKLED(FoodCategory.MEAT),
  PIG_EAR(FoodCategory.MEAT),
  PORK_LIVER(FoodCategory.MEAT),
  PORK_HEART(FoodCategory.MEAT),
  PORK_TONGUE(FoodCategory.MEAT),
  LARD(FoodCategory.MEAT),
  CHICKEN_DRUMSTICK(FoodCategory.MEAT),
  CHICKEN(FoodCategory.MEAT),
  CHICKEN_LIVER(FoodCategory.MEAT),
  CHICKEN_HEART(FoodCategory.MEAT),
  CHICKEN_LEG(FoodCategory.MEAT),
  CHICKEN_BREAST(FoodCategory.MEAT),
  CHICKEN_WING(FoodCategory.MEAT),
  CHICKEN_FEET(FoodCategory.MEAT),
  CHICKEN_NECK(FoodCategory.MEAT),
  GOAT(FoodCategory.MEAT),
  TURKEY(FoodCategory.MEAT),
  // diary
  CHEESE_FETA(FoodCategory.DAIRY),
  GOUDA_CHEESE(FoodCategory.DAIRY),
  MILK1P(FoodCategory.DAIRY),
  YOGURT(FoodCategory.DAIRY),
  YOGURT_GREEK(FoodCategory.DAIRY),
  CHEESE_COTTAGE(FoodCategory.DAIRY),
  BUTTER(FoodCategory.DAIRY),
  MILK_HUMAN(FoodCategory.DAIRY),
  // water animals
  SALMON(FoodCategory.FISH),
  OYSTER(FoodCategory.SEAFOOD),
  CRAB(FoodCategory.SEAFOOD),
  MUSSEL(FoodCategory.SEAFOOD),
  OCTOPUS(FoodCategory.SEAFOOD),
  SQUID(FoodCategory.SEAFOOD),
  SHRIMP(FoodCategory.SEAFOOD),
  GROUPER(FoodCategory.FISH),
  GILT_HEAD_BREAM(FoodCategory.FISH),
  TUNA_CANNED(FoodCategory.FISH),
  TUNA_BLUEFIN(FoodCategory.FISH),
  SARDINE(FoodCategory.FISH),
  TILAPIA(FoodCategory.FISH),
  COD(FoodCategory.FISH),
  MULLET(FoodCategory.FISH),
  SNAPPER(FoodCategory.FISH),
  TROUT(FoodCategory.FISH),

  EGG_YOLK(FoodCategory.EGG),
  EGG(FoodCategory.EGG),
  EGG_WHITE(FoodCategory.EGG),
  // roots
  CARROT(FoodCategory.ROOT),
  CARROT_JUICE(FoodCategory.ROOT),
  POTATO(FoodCategory.ROOT),
  SWEET_POTATO(FoodCategory.ROOT),
  GARLIC(FoodCategory.ROOT),
  TURNIP(FoodCategory.ROOT),
  RADISH(FoodCategory.ROOT),
  ONION(FoodCategory.ROOT),
  BEETS(FoodCategory.ROOT),
  // nuts
  WALNUT(FoodCategory.NUT),
  PECAN(FoodCategory.NUT),
  ALMOND(FoodCategory.NUT),
  HAZELNUT(FoodCategory.NUT),
  CASHEW(FoodCategory.NUT),
  BRAZILNUT(FoodCategory.NUT),
  CHESTNUT(FoodCategory.NUT),
  PEANUT(FoodCategory.NUT),
  COCONUT(FoodCategory.NUT),
  COCONUT_DESICCATED(FoodCategory.NUT),
  COCONUT_FLOUR(FoodCategory.NUT),
  COCONUT_CREAM(FoodCategory.NUT),
  COCONUT_MILK(FoodCategory.NUT),
  CHOCOLATE(FoodCategory.NUT),
  CHOCOLATE_DARK_70_85(FoodCategory.NUT),
  // oils
  OLIVE_OIL(FoodCategory.OIL),
  COCONUT_OIL(FoodCategory.OIL),
  HONEY(FoodCategory.OTHER),
  // vegetable
  JUTE(FoodCategory.VEGETABLE),
  OKRA(FoodCategory.VEGETABLE),
  SPINACH(FoodCategory.VEGETABLE),
  PARSLEY(FoodCategory.VEGETABLE),
  CORIANDER(FoodCategory.VEGETABLE),
  KALE(FoodCategory.VEGETABLE),
  LAVER(FoodCategory.VEGETABLE),
  KELP(FoodCategory.VEGETABLE),
  WAKAME(FoodCategory.VEGETABLE),
  LETTUCE(FoodCategory.VEGETABLE),
  ARUGULA(FoodCategory.VEGETABLE),
  BASIL(FoodCategory.VEGETABLE),
  BROCCOLI(FoodCategory.VEGETABLE),
  SPEARMINT(FoodCategory.VEGETABLE),
  ONION_YOUNG_GREEN(FoodCategory.VEGETABLE),
  CABBAGE(FoodCategory.VEGETABLE),
  ARTICHOKE(FoodCategory.VEGETABLE),
  CAULIFLOWER(FoodCategory.VEGETABLE),
  CHARD_SWISS(FoodCategory.VEGETABLE),
  CELERY(FoodCategory.VEGETABLE),
  ENDIVE(FoodCategory.VEGETABLE),
  CHICORY(FoodCategory.VEGETABLE),
  // fungus
  MUSHROOM(FoodCategory.FUNGUS),
  // cereals
  BULGUR(FoodCategory.CEREAL),
  RICE(FoodCategory.CEREAL),
  RICE_CAKE(FoodCategory.CEREAL),
  QUINOA(FoodCategory.CEREAL),
  CORNFLAKES(FoodCategory.CEREAL),
  OAT(FoodCategory.CEREAL),
  // legume
  CHICKPEA(FoodCategory.LEGUME),
  BROADBEAN(FoodCategory.LEGUME),
  LENTIL(FoodCategory.LEGUME),
  BEAN_SNAP_YELLOW(FoodCategory.LEGUME),
  BEAN_GREEN(FoodCategory.LEGUME),
  COWPEAS(FoodCategory.LEGUME),
  PEA(FoodCategory.LEGUME),
  // sprouts
  SPROUT_MUNG_BEAN(FoodCategory.SPROUT),
  // spices
  COFFEE_INSTANT(FoodCategory.SPICE),
  TURMERIC(FoodCategory.SPICE),
  THYME(FoodCategory.SPICE),
  // baked
  PITA_WHITE(FoodCategory.BAKED),
  // seeds
  TAHINI(FoodCategory.SEED),
  HALVAH(FoodCategory.SEED),
  CHOCOLATE_CAKE(FoodCategory.COMPOSITE),
  ROCK_CAKE(FoodCategory.COMPOSITE),
  BABY_SALAD(FoodCategory.COMPOSITE);
  private FoodCategory foodCategory;

  FoodItemType(FoodCategory foodCategory) {
    this.foodCategory = foodCategory;
  }

  public FoodCategory getFoodCategory() {
    return foodCategory;
  }
}

/*
 * †Dr Firas Swidan, PhD. frsswdn@gmail.com. firas.swidna@icloud.com.
 * https://www.linkedin.com/in/swidan
 * POBox  8125,  Nazareth  16480, Israel.
 * Public key: AAAAB3NzaC1yc2EAAAADAQABAAACAQD6Lt98LolwuA/aOcK0h91ECdeiyG3QKcUOT/CcMEPV64cpkv3jrLLGoag7YtzESZ3j7TLEd0WHZ/BZ9d+K2kRfzuuCdMMhrBwqP3YObbTbSIM6NjUNwbH403LLb3FuYApUt1EvC//w64UMm7h3fTo0vdyVuMuGnkRZuM6RRAXcODM4tni9ydd3ZQKN4inztkeH/sOoM77FStk8E2VYbljUQdY39zlRoZwUqNdKzwD3T2G00tmROlTZ6K5L8i68Zqt6s0XNS6XQvS3zXe0fI6UwuetnDrcVr1Yb8y2T8lfjMG9+9L2aKPoUOlOMMcyqM+oKVvRUOSdrzmtKOljnYC7TqzvsKrfXHvHlqHxxhPp1K7B/YWrHwCDbqp02dXdIaXkkHCIqKFNaY06HEWt4obDxppVhC8IabSb55LQVCCT7J4TFbwp6rID2+Y1L7NEvR3v3oaWSlQIZ+WSG04mwh9/7gRCt7XUoqmEXCCPoHqZXq5sWv193XA57pD5gKoX7Rf2i6UdbduNTMIhQMqcWIaPMBFwxUv/LRQCHnS+mlW2GnIHIHHGS/S46MurZ6BMvcb7fEz/NorVxvh3DbUaVTteMYcikH0y5sPmGECB1d99ENBBSEX6diI+PneFp2sOouQ6gOBWy6WAt3spGfLTOFMPo3bMV/UpktkQPpXkmfd1esQ==
 */