package org.example.factory;

public class Main {
    public static void main(String[] args) {
        CarCreator sedanCreator = new SedanCreator();
        sedanCreator.drive();

        CarCreator minivanCreator = new MinivanCreator();
        minivanCreator.drive();

        CarCreator cabrioletCreator = new CabrioletCreator();
        cabrioletCreator.drive();
    }
}
