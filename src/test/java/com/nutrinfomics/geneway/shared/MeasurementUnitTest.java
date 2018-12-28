package com.nutrinfomics.geneway.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import com.nutrinfomics.geneway.shared.testcategory.FastTest;

@Category(value = { FastTest.class })
public class MeasurementUnitTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private Logger LOGGER = Logger.getLogger(MeasurementUnit.class.getName());

	public class LogHandler extends Handler {
		private List<LogRecord> logRecords = new ArrayList<>();

		@Override
		public void publish(LogRecord record) {
			logRecords.add(record);
		}

		@Override
		public void flush() {
		}

		@Override
		public void close() throws SecurityException {
		}

		public List<LogRecord> getLogRecords() {
			return logRecords;
		}
	}

	private LogHandler logHandler = new LogHandler();

	@Before
	public void setUp() {
		LOGGER.addHandler(logHandler);
	}

	@Test
	public void testParseString() {
		assertEquals(MeasurementUnit.CUP, MeasurementUnit.parse(MeasurementUnit.CUP.toString()));
		assertEquals(0, logHandler.getLogRecords().size());
	}

	@Test
	public void testParseStringG() {
		assertEquals(MeasurementUnit.GRAM, MeasurementUnit.parse("g"));
		assertEquals(0, logHandler.getLogRecords().size());
	}

	@Test
	public void testParseStringException() {
		try {
			MeasurementUnit.parse("a");
			fail("Expected exception of type IllegalArgumentException");
		} catch (IllegalArgumentException ex) {
			assertEquals("No enum constant com.nutrinfomics.geneway.shared.MeasurementUnit.A", ex.getMessage());
			assertEquals(1, logHandler.getLogRecords().size());
			assertEquals(Level.SEVERE, logHandler.getLogRecords().get(0).getLevel());

		}
	}

	@Test
	public void testParseStringTrim() {
		assertEquals(MeasurementUnit.MICROGRAM, MeasurementUnit.parse("�g "));
		assertEquals(0, logHandler.getLogRecords().size());
	}

	@Test
	public void testParseStringArrayInt() {
		String[] nutrientUnits = new String[] { "g", MeasurementUnit.KCAL.toString(), "�g " };
		int from = 1;
		MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
		Assert.assertArrayEquals(new MeasurementUnit[] { MeasurementUnit.KCAL, MeasurementUnit.MICROGRAM },
				actualMeasurementUnits);
		assertEquals(0, logHandler.getLogRecords().size());
	}

	@Test
	public void testParseStringArrayIntException() {
		String[] nutrientUnits = new String[] { "b ", MeasurementUnit.KCAL.toString(), "�g " };
		int from = 0;

		try {
			MeasurementUnit.parse(nutrientUnits, from);
			fail("Expceted exception of type IllegalArgumentException");
		} catch (IllegalArgumentException ex) {
			assertEquals("No enum constant com.nutrinfomics.geneway.shared.MeasurementUnit.B", ex.getMessage());
			assertEquals(1, logHandler.getLogRecords().size());
			assertEquals(Level.SEVERE, logHandler.getLogRecords().get(0).getLevel());

		}

	}

	@Test
	public void testParseStringArrayIntEmpty() {
		String[] nutrientUnits = null;
		int from = 1;
		MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
		assertEquals(0, actualMeasurementUnits.length);
		assertEquals(0, logHandler.getLogRecords().size());
	}

	@Test
	public void testParseStringArrayIntOutOfRange() {
		String[] nutrientUnits = new String[] { "g", MeasurementUnit.KCAL.toString(), "�g " };
		int from = 3;
		MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
		assertEquals(0, actualMeasurementUnits.length);
		assertEquals(0, logHandler.getLogRecords().size());
	}
}
