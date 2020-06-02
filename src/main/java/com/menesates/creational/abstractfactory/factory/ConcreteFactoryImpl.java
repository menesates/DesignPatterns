package com.menesates.creational.abstractfactory.factory;

import com.menesates.creational.abstractfactory.AbstractFactory;
import com.menesates.creational.abstractfactory.biber.Biber;
import com.menesates.creational.abstractfactory.biber.DolmaBiber;
import com.menesates.creational.abstractfactory.elma.Elma;
import com.menesates.creational.abstractfactory.elma.KirmiziElma;

public class ConcreteFactoryImpl implements AbstractFactory {

    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmaBiber();
    }
}
