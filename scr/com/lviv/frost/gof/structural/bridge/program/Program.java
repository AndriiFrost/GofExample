package com.lviv.frost.gof.structural.bridge.program;

import com.lviv.frost.gof.structural.bridge.developer.Developer;

public abstract class Program {
    protected final Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
