package com.lviv.frost.gof.structural.adapter;

import com.lviv.frost.gof.structural.adapter.electricitysystem.INewElectricitySystem;
import com.lviv.frost.gof.structural.adapter.electricitysystem.OldElectricitySystem;
import com.lviv.frost.gof.structural.adapter.electricitysystem.impl.ElectricitySystemAdapter;
import com.lviv.frost.gof.structural.adapter.electricitysystem.impl.NewElectricitySystem;

public class AdapterApp {

    public static void main(String[] args) {

        //with new Electricity system
        INewElectricitySystem newElectricitySystem = new NewElectricitySystem();
        ElectricityConsumer.chargeNotebook(newElectricitySystem);

        //with old Electricity system
        OldElectricitySystem oldElectricitySystem = new OldElectricitySystem();
        INewElectricitySystem electricitySystemAdapter = new ElectricitySystemAdapter(oldElectricitySystem);
        ElectricityConsumer.chargeNotebook(electricitySystemAdapter);


    }
}
