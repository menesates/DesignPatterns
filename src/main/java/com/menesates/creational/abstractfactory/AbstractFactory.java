package com.menesates.creational.abstractfactory;

import com.menesates.creational.abstractfactory.biber.Biber;
import com.menesates.creational.abstractfactory.elma.Elma;

public interface AbstractFactory {
    Elma getElma();
    Biber getBiber();
}
