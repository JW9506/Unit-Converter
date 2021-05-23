package main.menu.category;

import main.menu.converters.ConverterBase;
import main.menu.converters.TeaspoonsCups;
import main.menu.converters.TeaspoonsTablespoons;

public class Volume extends CategoryBase {
  final public static CategoryBase instance = new Volume();

  private Volume() {
    converters = new ConverterBase[] { TeaspoonsCups.instance, TeaspoonsTablespoons.instance };
  }
}
