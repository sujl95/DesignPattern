package me.thewing.designpatterns._01_creational_patterns._01_singleton;

public class Settings {

  private static Settings instance;

  private Settings() {}

  public static Settings getInstance() {
    if (instance == null) {
      synchronized (Settings.class) {
        if (instance == null) {
          instance = new Settings();
        }
      }
    }
    return instance;
  }

}
