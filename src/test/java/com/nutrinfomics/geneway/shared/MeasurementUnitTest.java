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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import com.nutrinfomics.geneway.shared.testcategory.FastTest;

// TODO: Remove ignore once issue with LogHandler class on Azure-pipeline is resolved
@Ignore
@Category(value = {FastTest.class})
public class MeasurementUnitTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  //  private Logger LOGGER = Logger.getLogger(MeasurementUnit.class.getName());

  //  public class LogHandler extends Handler {
  //    private List<LogRecord> logRecords = new ArrayList<>();
  //
  //    @Override
  //    public void publish(LogRecord record) {
  //      logRecords.add(record);
  //    }
  //
  //    @Override
  //    public void flush() {}
  //
  //    @Override
  //    public void close() throws SecurityException {}
  //
  //    public List<LogRecord> getLogRecords() {
  //      return logRecords;
  //    }
  //  }

  //  private LogHandler logHandler = new LogHandler();

  //  @Before
  //  public void setUp() {
  //    LOGGER.addHandler(logHandler);
  //  }

  @Test
  public void testParseString() {
    assertEquals(MeasurementUnit.CUP, MeasurementUnit.parse(MeasurementUnit.CUP.toString()));
    //    assertEquals(0, logHandler.getLogRecords().size());
  }

  @Test
  public void testParseStringG() {
    assertEquals(MeasurementUnit.GRAM, MeasurementUnit.parse("g"));
    //    assertEquals(0, logHandler.getLogRecords().size());
  }

  @Test
  public void testParseStringException() {
    try {
      MeasurementUnit.parse("a");
      fail("Expected exception of type IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
      assertEquals(
          "No enum constant com.nutrinfomics.geneway.shared.MeasurementUnit.A", ex.getMessage());
      //      assertEquals(1, logHandler.getLogRecords().size());
      //      assertEquals(Level.SEVERE, logHandler.getLogRecords().get(0).getLevel());
    }
  }

  @Test
  public void testParseStringTrim() {
    assertEquals(MeasurementUnit.MICROGRAM, MeasurementUnit.parse("�g "));
    //    assertEquals(0, logHandler.getLogRecords().size());
  }

  @Test
  public void testParseStringArrayInt() {
    String[] nutrientUnits = new String[] {"g", MeasurementUnit.KCAL.toString(), "�g "};
    int from = 1;
    MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
    Assert.assertArrayEquals(
        new MeasurementUnit[] {MeasurementUnit.KCAL, MeasurementUnit.MICROGRAM},
        actualMeasurementUnits);
    //    assertEquals(0, logHandler.getLogRecords().size());
  }

  @Test
  public void testParseStringArrayIntException() {
    String[] nutrientUnits = new String[] {"b ", MeasurementUnit.KCAL.toString(), "�g "};
    int from = 0;

    try {
      MeasurementUnit.parse(nutrientUnits, from);
      fail("Expceted exception of type IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
      assertEquals(
          "No enum constant com.nutrinfomics.geneway.shared.MeasurementUnit.B", ex.getMessage());
      //      assertEquals(1, logHandler.getLogRecords().size());
      //      assertEquals(Level.SEVERE, logHandler.getLogRecords().get(0).getLevel());
    }
  }

  @Test
  public void testParseStringArrayIntEmpty() {
    String[] nutrientUnits = null;
    int from = 1;
    MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
    assertEquals(0, actualMeasurementUnits.length);
    //    assertEquals(0, logHandler.getLogRecords().size());
  }

  @Test
  public void testParseStringArrayIntOutOfRange() {
    String[] nutrientUnits = new String[] {"g", MeasurementUnit.KCAL.toString(), "�g "};
    int from = 3;
    MeasurementUnit[] actualMeasurementUnits = MeasurementUnit.parse(nutrientUnits, from);
    assertEquals(0, actualMeasurementUnits.length);
    //    assertEquals(0, logHandler.getLogRecords().size());
  }

  @Test
  public void testIsWeightUnit() {
    assertTrue(MeasurementUnit.GRAM.isWeightUnit());
    assertTrue(MeasurementUnit.KILOGRAM.isWeightUnit());
    assertTrue(MeasurementUnit.MICROGRAM.isWeightUnit());
    assertTrue(MeasurementUnit.MILLIGRAM.isWeightUnit());
  }
}

/*
 * †Dr Firas Swidan, PhD. frsswdn@gmail.com. firas.swidan@icloud.com.
 * https://www.linkedin.com/in/swidan
 * POBox  8125,  Nazareth  16480, Israel.
 * Public key: AAAAB3NzaC1yc2EAAAADAQABAAACAQD6Lt98LolwuA/aOcK0h91ECdeiyG3QKcUOT/CcMEPV64cpkv3jrLLGoag7YtzESZ3j7TLEd0WHZ/BZ9d+K2kRfzuuCdMMhrBwqP3YObbTbSIM6NjUNwbH403LLb3FuYApUt1EvC//w64UMm7h3fTo0vdyVuMuGnkRZuM6RRAXcODM4tni9ydd3ZQKN4inztkeH/sOoM77FStk8E2VYbljUQdY39zlRoZwUqNdKzwD3T2G00tmROlTZ6K5L8i68Zqt6s0XNS6XQvS3zXe0fI6UwuetnDrcVr1Yb8y2T8lfjMG9+9L2aKPoUOlOMMcyqM+oKVvRUOSdrzmtKOljnYC7TqzvsKrfXHvHlqHxxhPp1K7B/YWrHwCDbqp02dXdIaXkkHCIqKFNaY06HEWt4obDxppVhC8IabSb55LQVCCT7J4TFbwp6rID2+Y1L7NEvR3v3oaWSlQIZ+WSG04mwh9/7gRCt7XUoqmEXCCPoHqZXq5sWv193XA57pD5gKoX7Rf2i6UdbduNTMIhQMqcWIaPMBFwxUv/LRQCHnS+mlW2GnIHIHHGS/S46MurZ6BMvcb7fEz/NorVxvh3DbUaVTteMYcikH0y5sPmGECB1d99ENBBSEX6diI+PneFp2sOouQ6gOBWy6WAt3spGfLTOFMPo3bMV/UpktkQPpXkmfd1esQ==
 */
