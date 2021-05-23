package main.menu.converters;

public class FahrenheitCelsius extends ConverterBase {
  final public static ConverterBase instance = new FahrenheitCelsius();

  private FahrenheitCelsius() {
    unit1 = "Fahrenheit";
    unit2 = "Celsius";
  }

  @Override
  public double convert(double qty) {
    return (qty - 32) / 1.8;
  }
}
