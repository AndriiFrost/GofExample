package com.lviv.frost.gof.abstractfactory.factory;

import com.lviv.frost.gof.abstractfactory.model.Bear;
import com.lviv.frost.gof.abstractfactory.model.Cat;

public interface IToyFactory {

    Bear getBear();

    Cat getCat();

}
