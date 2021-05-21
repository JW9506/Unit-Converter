package main;

public class MilesKilometers extends UnitConversionBase {
  final public static UnitConversionBase instance = new MilesKilometers();

  private MilesKilometers() {
    unit1 = "Miles";
    unit2 = "Kilometers";
  }

  @Override
  protected double conversion(double qty, boolean flag) {
    final double C = 1.609344;
    if (flag) {
      return qty * C;
    } else {
      return qty / C;
    }
  }
}
