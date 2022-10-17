package main;

import animais.*;

public class Main {

    public static void main(String[] args) {
        //Animal galinha = new Chicken("Joselita");
        Chicken galinha = new Chicken("Joselita");
        Animal catioro = new Dog("Thomas");

        galinha.talk();
        galinha.fly();
        catioro.talk();
    }
}