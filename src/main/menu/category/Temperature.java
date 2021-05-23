package main.menu.category;

import main.menu.converters.ConverterBase;
import main.menu.converters.FahrenheitCelsius;
import main.menu.converters.KelvinCelsius;

public class Temperature extends CategoryBase {
  final public static CategoryBase instance = new Temperature();

  private Temperature() {
    converters = new ConverterBase[] { FahrenheitCelsius.instance, KelvinCelsius.instance };
  }
}
