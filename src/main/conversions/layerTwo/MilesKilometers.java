package main.conversions.layerTwo;

public class MilesKilometers extends LayerTwo {
  final public static MilesKilometers instance = new MilesKilometers();

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
