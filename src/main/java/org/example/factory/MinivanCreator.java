package org.example.factory;

class MinivanCreator extends CarCreator {
    Car createCar() {
        return new Minivan();
    }
}