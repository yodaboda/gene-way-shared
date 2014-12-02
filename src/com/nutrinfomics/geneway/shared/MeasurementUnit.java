package com.nutrinfomics.geneway.shared;

public enum MeasurementUnit{
	GRAM, MILLIGRAM, MICROGRAM, CUP, TEA_SPOON, TABLE_SPOON, UNITS, KCAL, SHEET, LEAF;
	
	public static MeasurementUnit parse(String measurementUnit) {
		measurementUnit = measurementUnit.trim();
		try{
			return MeasurementUnit.valueOf(measurementUnit.toUpperCase());
		}
		catch(IllegalArgumentException ex){
			if(measurementUnit.equals("g")){
				return GRAM;
			}
			else if(measurementUnit.equals("mg")){
				return MILLIGRAM;
			}
			else if(measurementUnit.equals("mcg")){
				return MICROGRAM;
			}
			else if(measurementUnit.equals("µg")){
				return MICROGRAM;
			}
			else throw ex;
		}
	}
	
	public static MeasurementUnit[] parse(String[] nutrientsUnits, int from) {
		MeasurementUnit[] nutrientUnits = new MeasurementUnit[nutrientsUnits.length - from];
		for(int i = from; i < nutrientsUnits.length; ++i){
			nutrientUnits[i - from] = MeasurementUnit.valueOf(nutrientsUnits[i]);
		}
		return nutrientUnits;
	}
}
