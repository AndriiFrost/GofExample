package com.lviv.frost.gof.structural.bridge.program;

import com.lviv.frost.gof.structural.bridge.developer.Developer;

public class BankSystemProgram extends Program {
    public BankSystemProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
