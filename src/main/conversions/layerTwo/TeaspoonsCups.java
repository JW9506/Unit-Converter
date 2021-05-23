package main.conversions.layerTwo;

public class TeaspoonsCups extends LayerTwo {
  final public static TeaspoonsCups instance = new TeaspoonsCups();

  private TeaspoonsCups() {
    unit1 = "Teaspoons";
    unit2 = "Cups";
  }

  @Override
  public double convert(double qty) {
    final double rate = 48;
    return qty / rate;
  }
}
