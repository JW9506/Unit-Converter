package main;

import java.util.InputMismatchException;

import main.utils.g;

public class Converter {
  private static UnitConversionBase view = null;

  public static void main(String[] args) {
    int menuSelection = -1;
    while (g.loop.isLoop()) {
      System.out.println("\nPlease select an option:");
      System.out.println("1. Cups to Teaspoons");
      System.out.println("2. Miles to Kilometers");
      System.out.println("3. Celsius to Fahrenheit");
      System.out.println("4. Quit");
      try {
        menuSelection = g.sc.nextInt();
      } catch (InputMismatchException e) {
        g.sc.next();
        System.out.println("Invalid input, please try again");
      } catch (Exception e) {
        g.Exit();
      }
      switch (menuSelection) {
        case 1:
          view = CupToTeaspoon.instance;
          break;
        case 2:
          view = MilesKilometers.instance;
          break;
        case 3:
          view = CelsiusFahrenheit.instance;
          break;
        case 4:
          view = null;
          g.loop.setLoop(false);
          break;
        default:
          System.out.println("Please select 1-4");
          break;
      }
      if (view != null) {
        view.show();
      }
    }
  }
}
