package main.conversions.layerOne;

import main.conversions.layerTwo.LayerTwo;
import main.conversions.layerTwo.MilesKilometers;

public class Distance extends LayerOne {
  final public static Distance instance = new Distance();

  private Distance() {
    layerTwo = new LayerTwo[] { MilesKilometers.instance };
  }
}
