package me.thewing.designpatterns._01_creational_patterns._01_singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.INSTANCE;
        Settings settings1 = null;
        Constructor<?>[] constructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            settings1 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);

    }

}
