package main;

public class CupToTeaspoon extends UnitConversionBase {
  final public static UnitConversionBase instance = new CupToTeaspoon();

  private CupToTeaspoon() {
    unit1 = "Cups";
    unit2 = "Teaspoons";
  }

  @Override
  protected double conversion(double qty, boolean flag) {
    if (flag) {
      return qty * 48;
    } else {
      return qty / 48;
    }
  }
}
