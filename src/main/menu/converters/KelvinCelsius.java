package main.menu.converters;

public class KelvinCelsius extends ConverterBase {
  final public static ConverterBase instance = new KelvinCelsius();

  private KelvinCelsius() {
    unit1 = "Kelvin";
    unit2 = "Celsius";
  }

  @Override
  public double convert(double qty) {
    final double rate = 273.15;
    return qty - rate;
  }
}
