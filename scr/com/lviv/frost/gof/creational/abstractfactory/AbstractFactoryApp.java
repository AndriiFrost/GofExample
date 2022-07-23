package com.lviv.frost.gof.creational.abstractfactory;

import com.lviv.frost.gof.creational.abstractfactory.factory.IToyFactory;
import com.lviv.frost.gof.creational.abstractfactory.factory.realisation.TeddyToysFactory;
import com.lviv.frost.gof.creational.abstractfactory.factory.realisation.WoodenToysFactory;
import com.lviv.frost.gof.creational.abstractfactory.model.Bear;
import com.lviv.frost.gof.creational.abstractfactory.model.Cat;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        realisationOfIToyFactory(new WoodenToysFactory());
        realisationOfIToyFactory(new TeddyToysFactory());
    }

    private static void realisationOfIToyFactory(IToyFactory toyFactory) {
        Bear bear = toyFactory.getBear();
        Cat cat = toyFactory.getCat();
        System.out.println(String.format("I've got %s and %s", bear.getName(), cat.getName()));
    }
}
