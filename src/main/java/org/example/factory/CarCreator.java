package org.example.factory;

abstract class CarCreator {
    abstract Car createCar();

    public void drive() {
        Car car = createCar();
        car.startMotor();
        car.accelerate();
        car.breakCar();
        car.turnOffMotor();
    }
}