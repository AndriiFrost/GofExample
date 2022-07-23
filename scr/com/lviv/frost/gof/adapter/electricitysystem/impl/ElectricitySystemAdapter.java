package com.lviv.frost.gof.adapter.electricitysystem.impl;

import com.lviv.frost.gof.adapter.electricitysystem.OldElectricitySystem;
import com.lviv.frost.gof.adapter.electricitysystem.INewElectricitySystem;

public class ElectricitySystemAdapter implements INewElectricitySystem {

    private final OldElectricitySystem oldElectricitySystem;

    public ElectricitySystemAdapter(OldElectricitySystem oldElectricitySystem) {
        this.oldElectricitySystem = oldElectricitySystem;
    }

    @Override
    public String matchWideSocket() {
        return oldElectricitySystem.matchThinSocket();
    }
}
