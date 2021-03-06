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

import java.util.logging.Level;
import java.util.logging.Logger;

public enum MeasurementUnit {
  KILOGRAM,
  CM,
  CENTIMETRE,
  GRAM,
  MILLIGRAM,
  MICROGRAM,
  CUP,
  TEA_SPOON,
  TABLE_SPOON,
  UNITS,
  KCAL,
  SHEET,
  LEAF;

  private static final Logger LOGGER = Logger.getLogger(MeasurementUnit.class.getName());

  public boolean isWeightUnit() {
    return this == KILOGRAM || this == GRAM || this == MILLIGRAM || this == MICROGRAM;
  }

  public float conversionFromGramRatio() {
    switch (this) {
      case GRAM:
        return 1F;
      case KILOGRAM:
        return 1 / 1000F;
      case MILLIGRAM:
        return 1000F;
      case MICROGRAM:
        return 1000000F;
      default:
        throw new IllegalCallerException("This is not a weight measurement unit");
    }
  }

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

/*
 * †Dr Firas Swidan, PhD. frsswdn@gmail.com. firas.swidan@icloud.com.
 * https://www.linkedin.com/in/swidan
 * POBox  8125,  Nazareth  16480, Israel.
 * Public key: AAAAB3NzaC1yc2EAAAADAQABAAACAQD6Lt98LolwuA/aOcK0h91ECdeiyG3QKcUOT/CcMEPV64cpkv3jrLLGoag7YtzESZ3j7TLEd0WHZ/BZ9d+K2kRfzuuCdMMhrBwqP3YObbTbSIM6NjUNwbH403LLb3FuYApUt1EvC//w64UMm7h3fTo0vdyVuMuGnkRZuM6RRAXcODM4tni9ydd3ZQKN4inztkeH/sOoM77FStk8E2VYbljUQdY39zlRoZwUqNdKzwD3T2G00tmROlTZ6K5L8i68Zqt6s0XNS6XQvS3zXe0fI6UwuetnDrcVr1Yb8y2T8lfjMG9+9L2aKPoUOlOMMcyqM+oKVvRUOSdrzmtKOljnYC7TqzvsKrfXHvHlqHxxhPp1K7B/YWrHwCDbqp02dXdIaXkkHCIqKFNaY06HEWt4obDxppVhC8IabSb55LQVCCT7J4TFbwp6rID2+Y1L7NEvR3v3oaWSlQIZ+WSG04mwh9/7gRCt7XUoqmEXCCPoHqZXq5sWv193XA57pD5gKoX7Rf2i6UdbduNTMIhQMqcWIaPMBFwxUv/LRQCHnS+mlW2GnIHIHHGS/S46MurZ6BMvcb7fEz/NorVxvh3DbUaVTteMYcikH0y5sPmGECB1d99ENBBSEX6diI+PneFp2sOouQ6gOBWy6WAt3spGfLTOFMPo3bMV/UpktkQPpXkmfd1esQ==
 */
