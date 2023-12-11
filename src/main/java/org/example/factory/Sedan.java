package org.example.factory;

class Sedan implements Car {
    @Override
    public void startMotor() {
        System.out.println("Sedan Motor gestartet.");
    }

    @Override
    public void accelerate() {
        System.out.println("Sedan beschleunigt.");
    }

    @Override
    public void breakCar() {
        System.out.println("Sedan bremst.");
    }

    @Override
    public void turnOffMotor() {
        System.out.println("Sedan Motor ausgeschaltet.");
        System.out.println();
    }
}