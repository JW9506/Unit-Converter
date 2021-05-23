package main.conversions;

public class CelsiusFahrenheit extends UnitConversionBase {
  final public static UnitConversionBase instance = new CelsiusFahrenheit();

  private CelsiusFahrenheit() {
    unit1 = "Celcius";
    unit2 = "Fahrenheit";
  }

  @Override
  protected double conversion(double qty, boolean flag) {
    if (flag) {
      return qty * 1.8 + 32;
    } else {
      return (qty - 32) / 1.8;
    }
  }
}
