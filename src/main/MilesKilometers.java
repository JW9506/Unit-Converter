package main;

import main.utils.g;

public class MilesKilometers extends Displayer {
  private static MilesKilometers instance = null;

  private MilesKilometers() {
    unit1 = "Miles";
    unit2 = "Kilometers";
  }

  public static MilesKilometers getInstance() {
    if (instance == null) {
      instance = new MilesKilometers();
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
    final double C = 1.609344;
    if (flag) {
      return qty * C;
    } else {
      return qty / C;
    }
  }
}
