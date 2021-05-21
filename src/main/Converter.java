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

  private static void display(String unit1, double qty1, String unit2, double qty2) {
    System.out.println("\nThere are " + qty2 + unit2 + " in " + qty1 + unit1 + "\n");
  }

  public static void main(String[] args) {
    int menuSelection = -1;
    while (loop.isLoop()) {
      System.out.println("Please select an option:");
      System.out.println("1. Cups(cup) to Teaspoons(tsp)");
      System.out.println("2. Miles(mi) to Kilometers(km)");
      System.out.println("3. Celsius(C) to Fahrenheit(F)");
      System.out.println("4. Quit");
      menuSelection = sc.nextInt();
      switch (menuSelection) {
        case 1:
          cupTeaspoonDisplay(loop);
          break;
        case 2:
          milesKilometersDisplay(loop);
          break;
        case 3:
          celsiusFahrenheitDisplay(loop);
          break;
        default:
          System.out.println("Please select 1-4");
          break;
      }
    }
  }

  private static void cupTeaspoonDisplay(Loop loop) {
    int menuSelection = -1;
    while (loop.isLoop()) {
      double unitInput = 0.0, unitOutput = 0.0;
      System.out.println("1. Cups to Teaspoons");
      System.out.println("2. Teaspoons to Cups");
      System.out.println("3. Quit");
      menuSelection = sc.nextInt();
      switch (menuSelection) {
        case 1:
          System.out.println("Enter cups:");
          unitInput = sc.nextDouble();
          unitOutput = cupsTeaspoons(unitInput, true);
          display("cups", unitInput, "tsp", unitOutput);
          break;
        case 2:
          System.out.println("Enter Teaspoons:");
          unitInput = sc.nextDouble();
          unitOutput = cupsTeaspoons(unitInput, false);
          display("tsp", unitInput, "cups", unitOutput);
          break;
        case 3:
          loop.setLoop(false);
          break;
        default:
          System.out.println("Please select 1-3");
          break;
      }
    }
    loop.setLoop(true);
  }

  private static void celsiusFahrenheitDisplay(Loop loop) {
    int menuSelection = -1;
    while (loop.isLoop()) {
      double unitInput = 0.0, unitOutput = 0.0;
      System.out.println("1. Celsius to Fahrenheit");
      System.out.println("2. Fahrenheit to Celsius");
      System.out.println("3. Quit");
      menuSelection = sc.nextInt();
      switch (menuSelection) {
        case 1:
          System.out.println("Enter Celsius:");
          unitInput = sc.nextDouble();
          unitOutput = celsiusFahrenheit(unitInput, true);
          display("C", unitInput, "F", unitOutput);
          break;
        case 2:
          System.out.println("Enter Fahrenheit:");
          unitInput = sc.nextDouble();
          unitOutput = celsiusFahrenheit(unitInput, false);
          display("F", unitInput, "C", unitOutput);
          break;
        case 3:
          loop.setLoop(false);
          break;
        default:
          System.out.println("Please select 1-3");
          break;
      }
    }
    loop.setLoop(true);
  }

  private static void milesKilometersDisplay(Loop loop) {
    int menuSelection = -1;
    while (loop.isLoop()) {
      double unitInput = 0.0, unitOutput = 0.0;
      System.out.println("1. Miles to Kilometers");
      System.out.println("2. Kilometers to Miles");
      System.out.println("3. Quit");
      menuSelection = sc.nextInt();
      switch (menuSelection) {
        case 1:
          System.out.println("Enter Miles:");
          unitInput = sc.nextDouble();
          unitOutput = milesKilometers(unitInput, true);
          display("mi", unitInput, "km", unitOutput);
          break;
        case 2:
          System.out.println("Enter Kilometers:");
          unitInput = sc.nextDouble();
          unitOutput = milesKilometers(unitInput, false);
          display("km", unitInput, "mi", unitOutput);
          break;
        case 3:
          loop.setLoop(false);
          break;
        default:
          System.out.println("Please select 1-3");
          break;
      }
    }
    loop.setLoop(true);
  }
}
