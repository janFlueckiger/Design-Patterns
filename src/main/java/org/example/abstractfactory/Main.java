package org.example.abstractfactory;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Factories
        AbstractFactory msi = new MsiFactory();
        AbstractFactory asus = new AsusFactory();

        List<Gpu> gpuList = new ArrayList<Gpu>();
        gpuList.add(msi.createGpu());
        gpuList.add(asus.createGpu());

        for(Gpu g : gpuList) {
            g.assemble();
        }


        List<Monitor> monitorList = new ArrayList<Monitor>();
        monitorList.add(msi.createMonitor());
        monitorList.add(asus.createMonitor());

        for(Monitor m : monitorList) {
            m.assemble();
        }

    }
}
