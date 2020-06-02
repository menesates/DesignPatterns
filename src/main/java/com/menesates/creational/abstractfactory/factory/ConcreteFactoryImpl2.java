package com.menesates.creational.abstractfactory.factory;

import com.menesates.creational.abstractfactory.AbstractFactory;
import com.menesates.creational.abstractfactory.biber.Biber;
import com.menesates.creational.abstractfactory.biber.YesilBiber;
import com.menesates.creational.abstractfactory.elma.Elma;
import com.menesates.creational.abstractfactory.elma.YesilElma;

public class ConcreteFactoryImpl2 implements AbstractFactory {
    @Override
    public Elma getElma() {
        return new YesilElma();
    }

    @Override
    public Biber getBiber() {
        return new YesilBiber();
    }
}
