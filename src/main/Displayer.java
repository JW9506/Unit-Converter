package main;

import main.utils.g;

public abstract class Displayer {
  protected String unit1;
  protected String unit2;
  protected int menuSelection = -1;
  protected double unitInput = 0.0;
  protected double unitOutput = 0.0;

  abstract protected void display();

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

  public void show() {
    while (g.loop.isLoop()) {
      System.out.println();
      System.out.println("1. " + unit1 + " to " + unit2);
      System.out.println("2. " + unit2 + " to " + unit1);
      System.out.println("3. Quit");
      display();
    }
    g.loop.setLoop(true);
  }
}
