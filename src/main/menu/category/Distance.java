package main.menu.category;

import main.menu.converters.FeetMeter;
import main.menu.converters.ConverterBase;
import main.menu.converters.MilesKilometers;

public class Distance extends CategoryBase {
  final public static CategoryBase instance = new Distance();

  private Distance() {
    converters = new ConverterBase[] { MilesKilometers.instance, FeetMeter.instance };
  }
}
