package main;

import main.utils.g;

public class Converter {
  private static Displayer view = null;

  public static void main(String[] args) {
    int menuSelection = -1;
    while (g.loop.isLoop()) {
      System.out.println("\nPlease select an option:");
      System.out.println("1. Cups to Teaspoons");
      System.out.println("2. Miles to Kilometers");
      System.out.println("3. Celsius to Fahrenheit");
      System.out.println("4. Quit");
      menuSelection = g.sc.nextInt();
      switch (menuSelection) {
        case 1:
          view = CupToTeaspoon.getInstance();
          break;
        case 2:
          view = MilesKilometers.getInstance();
          break;
        case 3:
          view = CelsiusFahrenheit.getInstance();
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
