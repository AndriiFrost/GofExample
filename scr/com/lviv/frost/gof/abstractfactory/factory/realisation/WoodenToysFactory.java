package com.lviv.frost.gof.abstractfactory.factory.realisation;

import com.lviv.frost.gof.abstractfactory.factory.IToyFactory;
import com.lviv.frost.gof.abstractfactory.model.Bear;
import com.lviv.frost.gof.abstractfactory.model.Cat;
import com.lviv.frost.gof.abstractfactory.model.WoodenBear;
import com.lviv.frost.gof.abstractfactory.model.WoodenCat;

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
