package me.thewing.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

public class Settings implements Serializable {

  private Settings() {}

  private static class SettingHolder {
    private static final Settings INSTANCE = new Settings();
  }

  public static Settings getInstance() {
    return SettingHolder.INSTANCE;
  }

  protected Object readResolve() {
    return getInstance();
  }

}
