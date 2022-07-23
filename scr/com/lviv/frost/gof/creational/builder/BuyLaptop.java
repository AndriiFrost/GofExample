package com.lviv.frost.gof.creational.builder;

import com.lviv.frost.gof.creational.builder.laptopbuilder.LaptopBuilder;
import com.lviv.frost.gof.creational.builder.model.Laptop;

public class BuyLaptop {

    private LaptopBuilder laptopBuilder;

    public void setLaptopBuilder(LaptopBuilder lBuilder) {
        laptopBuilder = lBuilder;
    }

    public Laptop getLaptop() {
        return laptopBuilder.getMyLaptop();
    }

    public void constructLaptop() {
        laptopBuilder.createNewLaptop();
        laptopBuilder.buildMonitorResolution();
        laptopBuilder.buildProcessor();
        laptopBuilder.buildMemory();
        laptopBuilder.buildHDD();
        laptopBuilder.buildBattery();
    }
}