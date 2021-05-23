package main;

import java.util.InputMismatchException;

import main.common.g;
import main.conversions.layerOne.Distance;
import main.conversions.layerOne.LayerOne;
import main.conversions.layerOne.Volume;

public class Converter {
  private static LayerOne view = null;

  public static void main(String[] args) {
    int menuSelection = -1;
    while (g.loop.isLoop()) {
      System.out.println("\nPlease select an option:");
      System.out.println("1. Volume Conversions");
      System.out.println("2. Distance Conversions");
      System.out.println("3. Quit");
      try {
        menuSelection = g.sc.nextInt();
      } catch (InputMismatchException e) {
        g.sc.next();
        System.out.println("Invalid input, please try again");
      } catch (Exception e) {
        g.Exit();
      }
      switch (menuSelection) {
        default:
          System.out.println("Please select 1-3");
          break;
        case 1:
          view = Volume.instance;
          break;
        case 2:
          view = Distance.instance;
          break;
        case 3:
          g.Exit();
      }
      if (view != null) {
        view.show();
      }
    }
  }
}
