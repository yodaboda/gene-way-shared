package com.nutrinfomics.geneway.shared.constants;

import java.util.Locale;
import java.util.ResourceBundle;

import com.nutrinfomics.geneway.shared.FoodItemType;
import com.nutrinfomics.geneway.shared.MeasurementUnit;
import com.nutrinfomics.geneway.shared.SupplementType;

public class ResourceBundles {
	private final static String PATH = "com/nutrinfomics/geneway/shared/constants/";

	private static String getResourcePath(String fileName) {
		return PATH + fileName;
	}
	
	public static String getFoodItemResource(FoodItemType foodItemType, Locale locale){
		return ResourceBundle.getBundle(getResourcePath("FoodItemTypeConstants"), locale).getString(foodItemType.toString());
	}
	
	public static String getMeasurementResource(MeasurementUnit measurementUnit, Locale locale){
		return ResourceBundle.getBundle(getResourcePath("MeasurementsConstants"), locale).getString(measurementUnit.toString());
	}
	
	public static String getSupplementsResource(SupplementType supplement, Locale locale){
		return ResourceBundle.getBundle(getResourcePath("SupplementsConstants"), locale).getString(supplement.toString());
	}

	public static String getMiscResource(String string, Locale locale) {
		return ResourceBundle.getBundle(getResourcePath("MiscConstants"), locale).getString(string);
	}

	public static String getGeneWayResource(String string, Locale locale) {
		return ResourceBundle.getBundle(getResourcePath("GeneWayConstants"), locale).getString(string);
	}
	
	public static String getOpeningHoursResource(String string, Locale locale) {
		return ResourceBundle.getBundle(getResourcePath("OpeningHours"), locale).getString(string);
	}

	public static String getCongratulationsResource(String string, Locale locale) {
		return ResourceBundle.getBundle(getResourcePath("Congratulations"), locale).getString(string);
	}

	
}
