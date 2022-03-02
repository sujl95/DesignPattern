package me.thewing.designpatterns._01_creational_patterns._01_singleton;

public class Settings {

  private Settings() {}

  private static class SettingHolder {
    private static final Settings INSTANCE = new Settings();
  }

  public static Settings getInstance() {
    return SettingHolder.INSTANCE;
  }

}
