package main.menu.category;

import java.util.InputMismatchException;

import main.common.g;
import main.menu.converters.ConverterBase;

public abstract class CategoryBase {
  ConverterBase[] converters = null;

  private void outputMsg(double qty1, String unit1, double qty2, String unit2) {
    System.out.println("\nThere are " + qty2 + " " + unit2 + " in " + qty1 + " " + unit1 + ".\n");
  }

  final public void show() {
    int menuSelection = -1;
    double unitInput = 0.0, unitOutput = 0.0;
    while (g.loop.isLoop()) {
      unitInput = 0.0;
      unitOutput = 0.0;
      System.out.println();
      int i;
      // print names of implemented conversions inside an implemented category
      for (i = 0; i < converters.length; ++i) {
        System.out.println((i + 1) + ". " + converters[i].unit1 + " to " + converters[i].unit2);
      }
      System.out.println((i + 1) + ". Back to last menu");
      try {
        menuSelection = g.sc.nextInt();
        if (menuSelection - 1 < converters.length) {
          // dynamically select a converter
          ConverterBase sel = converters[menuSelection - 1];
          System.out.println("Enter " + sel.unit1 + ":");
          unitInput = g.sc.nextDouble();
          // invoking the `convert` method from a specific converter
          unitOutput = sel.convert(unitInput);
          outputMsg(unitInput, sel.unit1, unitOutput, sel.unit2);
        } else if (menuSelection - 1 == converters.length) {
          g.loop.setLoop(false);
        } else {
          System.out.println("Please select 1-" + converters.length + 1);
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
