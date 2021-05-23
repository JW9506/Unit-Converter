package main.conversions;

import java.util.InputMismatchException;

import main.common.g;

public abstract class UnitConversionBase {
  protected String unit1;
  protected String unit2;

  abstract protected double conversion(double qty, boolean flag);

  protected void outputMsg(double qty1, double qty2, boolean flag) {
    String _unit1, _unit2;
    if (flag) {
      _unit1 = unit1;
      _unit2 = unit2;
    } else {
      _unit1 = unit2;
      _unit2 = unit1;
    }
    System.out.println("\nThere are " + qty2 + " " + _unit2 + " in " + qty1 + " " + _unit1 + ".\n");
  }

  final public void show() {
    int menuSelection = -1;
    double unitInput = 0.0, unitOutput = 0.0;
    while (g.loop.isLoop()) {
      unitInput = 0.0;
      unitOutput = 0.0;
      System.out.println();
      System.out.println("1. " + unit1 + " to " + unit2);
      System.out.println("2. " + unit2 + " to " + unit1);
      System.out.println("3. Back to last menu");
      try {
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
      } catch (InputMismatchException e) {
        g.sc.next();
        System.out.println("Invalid input, please try again");
      } catch (Exception e) {
        g.Exit();
      }
    }
    g.loop.setLoop(true);
  }
}
