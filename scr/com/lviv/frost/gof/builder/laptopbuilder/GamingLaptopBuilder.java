package com.lviv.frost.gof.builder.laptopbuilder;

public class GamingLaptopBuilder extends LaptopBuilder {
    @Override
    public void buildMonitorResolution() {
        laptop.setMonitorResolution("1900x1200");
    }

    @Override
    public void buildProcessor() {
        laptop.setProcessor("Core 2 Duo, 3.2 GHz");
    }

    @Override
    public void buildMemory() {
        laptop.setMemory("6144 Mb");
    }

    @Override
    public void buildHDD() {
        laptop.setHdd("500 gb");
    }

    @Override
    public void buildBattery() {
        laptop.setBattery("6 lbs");
    }
}
