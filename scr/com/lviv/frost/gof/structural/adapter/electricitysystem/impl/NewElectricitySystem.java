package com.lviv.frost.gof.structural.adapter.electricitysystem.impl;

import com.lviv.frost.gof.structural.adapter.electricitysystem.INewElectricitySystem;

public class NewElectricitySystem implements INewElectricitySystem {
    @Override
    public String matchWideSocket() {
        return "220V";
    }
}
