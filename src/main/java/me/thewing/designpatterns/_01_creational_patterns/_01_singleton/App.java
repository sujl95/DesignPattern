package me.thewing.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings = Settings.getInstance();
        Settings settings1 = null;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("setting.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings) in.readObject();
        }

        System.out.println(settings == settings1);

    }

}
