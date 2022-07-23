package com.lviv.frost.gof.structural.bridge.developer.impl;

import com.lviv.frost.gof.structural.bridge.developer.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev is writing code...");
    }
}
