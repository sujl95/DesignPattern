package me.thewing.designpatterns._03_java;

import me.thewing.designpatterns._02_factorymethod._02_after.Blackship;
import me.thewing.designpatterns._02_factorymethod._02_after.Whiteship;

public class SimpleFactory {

    public Object createFactory(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }
        throw new IllegalArgumentException();
    }

}
