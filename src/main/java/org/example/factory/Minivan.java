package org.example.factory;

class Minivan implements Car {
    @Override
    public void startMotor() {
        System.out.println("Minivan Motor gestartet.");
    }

    @Override
    public void accelerate() {
        System.out.println("Minivan beschleunigt.");
    }

    @Override
    public void breakCar() {
        System.out.println("Minivan bremst.");
    }

    @Override
    public void turnOffMotor() {
        System.out.println("Minivan Motor ausgeschaltet.");
        System.out.println();
    }
}