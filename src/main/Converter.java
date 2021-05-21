package main;

import java.util.Scanner;

import main.utils.Loop;

public class Converter {
  private static Scanner sc = new Scanner(System.in);
  private static Loop loop = new Loop();

  private static double celsiusFahrenheit(double qty, boolean flag) {
    if (flag) {
      return qty * 1.8 + 32;
    } else {
      return (qty - 32) / 1.8;
    }
  }

  private static double cupsTeaspoons(double qty, boolean flag) {
    if (flag) {
      return qty * 48;
    } else {
      return qty / 48;
    }
  }

  private static double milesKilometers(double qty, boolean flag) {
    final double C = 1.609344;
    if (flag) {
      return qty * C;
    } else {
      return qty / C;
    }
  }

  public static void main(String[] args) {
    int menuSelection = -1;
    while (loop.isLoop()) {
      System.out.println("Please select an option:");
      System.out.println("1. Cups(cup) to Teaspoons(tsp)");
      System.out.println("2. Miles(mi) to Kilometers(km)");
      System.out.println("3. Celsius(C) to Fahrenheit(F)");
      System.out.println("4. Quit");
      menuSelection = Integer.parseInt(sc.nextLine());
      switch (menuSelection) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        default:
          System.out.println("Please select 1-4");
          break;
      }
    }
  }
}
