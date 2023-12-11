package org.example.factory;

class CabrioletCreator extends CarCreator {
    Car createCar() {
        return new Cabriolet();
    }
}