package com.menesates.creational.abstractfactory;

import com.menesates.creational.abstractfactory.biber.Biber;
import com.menesates.creational.abstractfactory.elma.Elma;
import com.menesates.creational.abstractfactory.factory.ConcreteFactoryImpl;
import com.menesates.creational.abstractfactory.factory.ConcreteFactoryImpl2;
import org.junit.Test;

public class ConcreteFactoryImplTest {

    @Test
    public void concreteFactoryImplTest(){
        AbstractFactory factory = new ConcreteFactoryImpl();
        Elma elma = factory.getElma();
        Biber biber = factory.getBiber();
        System.out.println(elma.getType());
        System.out.println(biber.getType());


        System.out.println("*******************");


        AbstractFactory factory2 = new ConcreteFactoryImpl2();
        Elma elma1 = factory2.getElma();
        Biber biber1 = factory2.getBiber();
        System.out.println(elma1.getType());
        System.out.println(biber1.getType());
    }
}