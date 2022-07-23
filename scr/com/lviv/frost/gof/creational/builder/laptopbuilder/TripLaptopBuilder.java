package com.lviv.frost.gof.creational.builder.laptopbuilder;

public class TripLaptopBuilder extends LaptopBuilder {
    @Override
    public void buildMonitorResolution() {
        laptop.setMonitorResolution("1200x800");
    }

    @Override
    public void buildProcessor() {
        laptop.setProcessor("Core 1 Duo, 3.2 GHz");
    }

    @Override
    public void buildMemory() {
        laptop.setMemory("1280 Mb");
    }

    @Override
    public void buildHDD() {
        laptop.setHdd("200 gb");
    }

    @Override
    public void buildBattery() {
        laptop.setBattery("4 lbs");
    }
}
