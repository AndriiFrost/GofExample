package com.lviv.frost.gof.creational.abstractfactory.factory.realisation;

import com.lviv.frost.gof.creational.abstractfactory.factory.IToyFactory;
import com.lviv.frost.gof.creational.abstractfactory.model.Bear;
import com.lviv.frost.gof.creational.abstractfactory.model.Cat;
import com.lviv.frost.gof.creational.abstractfactory.model.WoodenBear;
import com.lviv.frost.gof.creational.abstractfactory.model.WoodenCat;

public class WoodenToysFactory implements IToyFactory {
    @Override
    public Bear getBear() {
        return new WoodenBear();
    }

    @Override
    public Cat getCat() {
        return new WoodenCat();
    }
}
