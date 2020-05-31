package com.menesates.abstractfactory.factory;

import com.menesates.abstractfactory.AbstractFactory;
import com.menesates.abstractfactory.biber.Biber;
import com.menesates.abstractfactory.biber.DolmaBiber;
import com.menesates.abstractfactory.elma.Elma;
import com.menesates.abstractfactory.elma.KirmiziElma;

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
