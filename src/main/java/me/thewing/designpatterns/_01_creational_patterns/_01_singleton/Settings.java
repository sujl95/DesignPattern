package me.thewing.designpatterns._01_creational_patterns._01_singleton;

public class Settings {

  private static Settings INSTANCE = new Settings();

  private Settings() {}

  public static Settings getInstance() {
    return INSTANCE;
  }

}
