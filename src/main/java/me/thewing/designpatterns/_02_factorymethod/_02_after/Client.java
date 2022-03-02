package me.thewing.designpatterns._02_factorymethod._02_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "sujl95@naver.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "sujl95@naver.com");
        System.out.println(blackship);
    }
}
