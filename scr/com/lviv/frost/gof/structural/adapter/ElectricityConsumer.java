package com.lviv.frost.gof.structural.adapter;

import com.lviv.frost.gof.structural.adapter.electricitysystem.INewElectricitySystem;

public class ElectricityConsumer {

    public static void chargeNotebook(INewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.matchWideSocket());
    }
}
