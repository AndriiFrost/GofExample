package com.lviv.frost.gof.structural.bridge.developer.impl;

import com.lviv.frost.gof.structural.bridge.developer.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp dev is writing code...");
    }
}
