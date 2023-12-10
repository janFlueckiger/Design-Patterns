package org.example.abstractfactory;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Msi GPU erstellt");
    }
}