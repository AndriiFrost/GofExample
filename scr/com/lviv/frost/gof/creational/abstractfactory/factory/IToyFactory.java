package com.lviv.frost.gof.creational.abstractfactory.factory;

import com.lviv.frost.gof.creational.abstractfactory.model.Bear;
import com.lviv.frost.gof.creational.abstractfactory.model.Cat;

public interface IToyFactory {

    Bear getBear();

    Cat getCat();

}
