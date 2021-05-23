package main;

import java.util.InputMismatchException;

import main.common.g;
import main.menu.category.CategoryBase;
import main.menu.category.Distance;
import main.menu.category.Volume;

public class Converter {
  private static CategoryBase[] categories = new CategoryBase[] { Volume.instance, Distance.instance };

  public static void main(String[] args) {
    int menuSelection = -1;
    while (g.loop.isLoop()) {
      System.out.println("\nPlease select an option:");
      int i;
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
      if (menuSelection - 1 < categories.length) {
        categories[menuSelection - 1].show();
      } else if (menuSelection - 1 == categories.length) {
        g.Exit();
      } else {
        System.out.println("Please select 1-" + (categories.length + 1));
      }
    }
  }
}
