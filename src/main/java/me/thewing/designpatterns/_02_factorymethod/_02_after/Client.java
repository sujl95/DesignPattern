package me.thewing.designpatterns._02_factorymethod._02_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "sujl95@naver.com");
        client.print(new BlackshipFactory(), "blackship", "sujl95@naver.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
