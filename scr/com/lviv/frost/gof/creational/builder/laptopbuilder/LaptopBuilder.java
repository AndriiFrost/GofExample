package com.lviv.frost.gof.creational.builder.laptopbuilder;

import com.lviv.frost.gof.creational.builder.model.Laptop;

public abstract class LaptopBuilder {

    protected Laptop laptop;

    public void createNewLaptop() {
        laptop = new Laptop();
    }

    public Laptop getMyLaptop() {
        return laptop;
    }

    public abstract void buildMonitorResolution();

    public abstract void buildProcessor();

    public abstract void buildMemory();

    public abstract void buildHDD();

    public abstract void buildBattery();
}
