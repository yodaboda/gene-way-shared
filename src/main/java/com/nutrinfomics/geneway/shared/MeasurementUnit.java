package com.nutrinfomics.geneway.shared;

import java.util.logging.Level;
import java.util.logging.Logger;

public enum MeasurementUnit {
	KILOGRAM, CM, CENTIMETRE, GRAM, MILLIGRAM, MICROGRAM, CUP, TEA_SPOON, TABLE_SPOON, UNITS, KCAL, SHEET, LEAF;

	private static final Logger LOGGER = Logger.getLogger(MeasurementUnit.class.getName());

	public static MeasurementUnit parse(String measurementUnit) {
		measurementUnit = measurementUnit.trim();
		try {
			return MeasurementUnit.valueOf(measurementUnit.toUpperCase());
		} catch (IllegalArgumentException ex) {
			if (measurementUnit.equals("g")) {
				return GRAM;
			} else if (measurementUnit.equals("mg")) {
				return MILLIGRAM;
			} else if (measurementUnit.equals("mcg")) {
				return MICROGRAM;
			} else if (measurementUnit.equals("µg")) {
				return MICROGRAM;
			} else if (measurementUnit.equals("�g")) {
				return MICROGRAM;
			} else {
				LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
				throw ex;
			}
		}
	}

	public static MeasurementUnit[] parse(String[] nutrientsUnits, int from) {
		if (nutrientsUnits == null || nutrientsUnits.length <= from) {
			return new MeasurementUnit[0];
		}
		MeasurementUnit[] nutrientUnits = new MeasurementUnit[nutrientsUnits.length - from];
		for (int i = from; i < nutrientsUnits.length; ++i) {
			nutrientUnits[i - from] = MeasurementUnit.parse(nutrientsUnits[i]);
		}
		return nutrientUnits;
	}
}
