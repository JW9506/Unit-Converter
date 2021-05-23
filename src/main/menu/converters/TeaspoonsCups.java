package main.menu.converters;

public class TeaspoonsCups extends ConverterBase {
  final public static ConverterBase instance = new TeaspoonsCups();

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
