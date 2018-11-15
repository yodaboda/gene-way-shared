package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MeasurementUnitTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
	@Test
	public void testParseString() {
		assertEquals(MeasurementUnit.CUP,MeasurementUnit.parse(MeasurementUnit.CUP.toString()));
	}

	@Test
	public void testParseStringG() {
		assertEquals(MeasurementUnit.GRAM,MeasurementUnit.parse("g"));
	}

	@Test
	public void testParseStringException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("No enum constant com.nutrinfomics.geneway.shared.MeasurementUnit.A");
		MeasurementUnit.parse("a");
	}

	@Test
	public void testParseStringTrim(){
		assertEquals(MeasurementUnit.MICROGRAM,MeasurementUnit.parse("�g "));	
	}
	
	@Test
	public void testParseStringArrayInt() {
		String[] nutrientUnits = new String[]{"g", MeasurementUnit.KCAL.toString(), "�g "};
		int from = 1;
		MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
		Assert.assertArrayEquals(new MeasurementUnit[]{MeasurementUnit.KCAL, MeasurementUnit.MICROGRAM}, 
									actualMeasurementUnits);
	}

	@Test
	public void testParseStringArrayIntException() {
		String[] nutrientUnits = new String[]{"b ", MeasurementUnit.KCAL.toString(), "�g "};
		int from = 0;
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("No enum constant com.nutrinfomics.geneway.shared.MeasurementUnit.B");

		MeasurementUnit.parse(nutrientUnits, from);
	}

	@Test
	public void testParseStringArrayIntNull() {
		String[] nutrientUnits = null;
		int from = 1;
		MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
		assertNull(actualMeasurementUnits);
	}

	@Test
	public void testParseStringArrayIntOutOfRange() {
		String[] nutrientUnits = new String[]{"g", MeasurementUnit.KCAL.toString(), "�g "};
		int from = 3;
		MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
		assertNull(actualMeasurementUnits);
	}

}
