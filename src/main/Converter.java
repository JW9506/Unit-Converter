package main;

import java.util.InputMismatchException;

import main.common.g;
import main.menu.category.CategoryBase;
import main.menu.category.Distance;
import main.menu.category.Temperature;
import main.menu.category.Volume;

public class Converter {
  private static CategoryBase[] categories = new CategoryBase[] { Volume.instance, Distance.instance,
      Temperature.instance };

  public static void main(String[] args) {
    int menuSelection = -1;
    // main loop
    while (g.loop.isLoop()) {
      System.out.println("\nPlease select an option:");
      int i;
      // obtain the class names to be part of the menu formation
      for (i = 0; i < categories.length; ++i) {
        CategoryBase category = categories[i];
        System.out.println((i + 1) + ". " + category.getClass().getSimpleName() + " Conversions");
      }
      System.out.println((i + 1) + ". Quit");
      try {
        menuSelection = g.sc.nextInt();
      } catch (InputMismatchException e) {
        g.sc.next();
        System.out.println("Invalid input, please try again");
      } catch (Exception e) {
        g.Exit();
      }
      if (menuSelection - 1 < categories.length) { // if selection is valid
        categories[menuSelection - 1].show();
      } else if (menuSelection - 1 == categories.length) { // if user wants to quit
        g.Exit();
      } else { // out of bound selection
        System.out.println("Please select 1-" + (categories.length + 1));
      }
    }
  }
}
