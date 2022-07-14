package com.lviv.frost.gof.abstractfactory.model;

public abstract class AnimalToy {

    private final String name;

    public AnimalToy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
