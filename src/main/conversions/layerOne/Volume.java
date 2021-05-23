package main.conversions.layerOne;

import main.conversions.layerTwo.LayerTwo;
import main.conversions.layerTwo.TeaspoonsCups;

public class Volume extends LayerOne {
  final public static Volume instance = new Volume();

  private Volume() {
    layerTwo = new LayerTwo[] { TeaspoonsCups.instance };
  }
}
