package com.lviv.frost.gof.adapter.electricitysystem.impl;

import com.lviv.frost.gof.adapter.electricitysystem.INewElectricitySystem;

public class NewElectricitySystem implements INewElectricitySystem {
    @Override
    public String matchWideSocket() {
        return "220V";
    }
}
