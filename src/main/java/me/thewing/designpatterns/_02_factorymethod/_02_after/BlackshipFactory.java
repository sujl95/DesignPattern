package me.thewing.designpatterns._02_factorymethod._02_after;

public class BlackshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
