package me.thewing.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import me.thewing.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import me.thewing.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.thewing.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
