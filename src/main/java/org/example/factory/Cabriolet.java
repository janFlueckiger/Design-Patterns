package org.example.factory;

class Cabriolet implements Car {
    @Override
    public void startMotor() {
        System.out.println("Cabriolet Motor gestartet.");
    }

    @Override
    public void accelerate() {
        System.out.println("Cabriolet beschleunigt.");
    }

    @Override
    public void breakCar() {
        System.out.println("Cabriolet bremst.");
    }

    @Override
    public void turnOffMotor() {
        System.out.println("Cabriolet Motor ausgeschaltet.");
        System.out.println();
    }
}