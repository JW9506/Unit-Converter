package main.conversions.layerOne;

import java.util.InputMismatchException;

import main.common.g;
import main.conversions.layerTwo.LayerTwo;

public abstract class LayerOne {
  LayerTwo[] layerTwo = null;

  protected void outputMsg(double qty1, String unit1, double qty2, String unit2) {
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
      for (i = 0; i < layerTwo.length; ++i) {
        System.out.println((i + 1) + ". " + layerTwo[i].unit1 + " to " + layerTwo[i].unit2);
      }
      System.out.println((i + 1) + ". Back to last menu");
      try {
        menuSelection = g.sc.nextInt();
        if (menuSelection - 1 < layerTwo.length) {
          LayerTwo sel = layerTwo[menuSelection - 1];
          System.out.println("Enter " + sel.unit1 + ":");
          unitInput = g.sc.nextDouble();
          unitOutput = sel.convert(unitInput);
          outputMsg(unitInput, sel.unit1, unitOutput, sel.unit2);
        } else if (menuSelection - 1 == layerTwo.length) {
          g.loop.setLoop(false);
        } else {
          System.out.println("Please select 1-" + layerTwo.length + 1);
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
