package org.example.abstractfactory;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Asus GPU erstellt");
    }
}