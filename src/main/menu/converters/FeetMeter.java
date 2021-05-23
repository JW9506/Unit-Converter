package main.menu.converters;

public class FeetMeter extends ConverterBase {
  final public static ConverterBase instance = new FeetMeter();

  private FeetMeter() {
    unit1 = "Feet";
    unit2 = "Meters";
  }

  @Override
  public double convert(double qty) {
    final double rate = 3.2808;
    return qty / rate;
  }
}
