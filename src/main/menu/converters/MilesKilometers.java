package main.menu.converters;

public class MilesKilometers extends ConverterBase {
  final public static ConverterBase instance = new MilesKilometers();

  private MilesKilometers() {
    unit1 = "Miles";
    unit2 = "Kilometers";
  }

  @Override
  public double convert(double qty) {
    final double rate = 1.609344;
    return qty * rate;
  }
}
