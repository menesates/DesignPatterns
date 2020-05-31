package com.menesates.abstractfactory.factory;

import com.menesates.abstractfactory.AbstractFactory;
import com.menesates.abstractfactory.biber.Biber;
import com.menesates.abstractfactory.biber.YesilBiber;
import com.menesates.abstractfactory.elma.Elma;
import com.menesates.abstractfactory.elma.YesilElma;

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
