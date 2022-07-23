package com.lviv.frost.gof.adapter;

import com.lviv.frost.gof.adapter.electricitysystem.INewElectricitySystem;

public class ElectricityConsumer {

    public static void chargeNotebook(INewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.matchWideSocket());
    }
}
