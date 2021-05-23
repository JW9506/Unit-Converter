package main.menu.converters;

public abstract class ConverterBase {
  public String unit1 = null;
  public String unit2 = null;
  public abstract double convert(double qty);
}
