package org.example.factory;

class SedanCreator extends CarCreator {
    Car createCar() {
        return new Sedan();
    }
}