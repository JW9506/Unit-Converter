package main;

import main.utils.g;

public class CelsiusFahrenheit extends Displayer {
  private static CelsiusFahrenheit instance = null;

  private CelsiusFahrenheit() {
    unit1 = "Celcius";
    unit2 = "Fahrenheit";
  }

  public static CelsiusFahrenheit getInstance() {
    if (instance == null) {
      instance = new CelsiusFahrenheit();
    }
    return instance;
  }

  @Override
  protected void display() {
    menuSelection = g.sc.nextInt();
    switch (menuSelection) {
      case 1:
        System.out.println("Enter " + unit1 + ":");
        unitInput = g.sc.nextDouble();
        unitOutput = conversion(unitInput, true);
        outputMsg(unitInput, unitOutput, true);
        break;
      case 2:
        System.out.println("Enter " + unit2 + ":");
        unitInput = g.sc.nextDouble();
        unitOutput = conversion(unitInput, false);
        outputMsg(unitInput, unitOutput, false);
        break;
      case 3:
        g.loop.setLoop(false);
        break;
      default:
        System.out.println("Please select 1-3");
        break;
    }

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
