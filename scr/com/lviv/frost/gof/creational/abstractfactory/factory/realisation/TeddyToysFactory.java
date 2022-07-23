package com.lviv.frost.gof.creational.abstractfactory.factory.realisation;

import com.lviv.frost.gof.creational.abstractfactory.factory.IToyFactory;
import com.lviv.frost.gof.creational.abstractfactory.model.Bear;
import com.lviv.frost.gof.creational.abstractfactory.model.Cat;
import com.lviv.frost.gof.creational.abstractfactory.model.TeddyBear;
import com.lviv.frost.gof.creational.abstractfactory.model.TeddyCat;

public class TeddyToysFactory implements IToyFactory {
    @Override
    public Bear getBear() {
        return new TeddyBear();
    }

    @Override
    public Cat getCat() {
        return new TeddyCat();
    }
}
