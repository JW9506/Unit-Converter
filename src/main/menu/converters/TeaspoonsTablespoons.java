package main.menu.converters;

public class TeaspoonsTablespoons extends ConverterBase {
  final public static ConverterBase instance = new TeaspoonsTablespoons();

  private TeaspoonsTablespoons() {
    unit1 = "Teaspoons";
    unit2 = "Tablespoons";
  }

  @Override
  public double convert(double qty) {
    final double rate = 3;
    return qty / rate;
  }
}
