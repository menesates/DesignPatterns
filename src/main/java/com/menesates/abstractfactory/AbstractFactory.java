package com.menesates.abstractfactory;

import com.menesates.abstractfactory.biber.Biber;
import com.menesates.abstractfactory.elma.Elma;

public interface AbstractFactory {
    Elma getElma();
    Biber getBiber();
}
