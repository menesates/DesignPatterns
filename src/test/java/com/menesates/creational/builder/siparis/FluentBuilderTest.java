package com.menesates.creational.builder.siparis;

import com.menesates.creational.builder.araba.Araba;
import com.menesates.creational.builder.araba.Marka;
import com.menesates.creational.builder.araba.Model;
import org.junit.Test;

public class FluentBuilderTest {

    @Test
    public void build() {
        Araba araba = FluentBuilder.startBuilding()
                .withMarka(new Marka("Fiat"))
                .withModel(new Model("Dublo"))
                .withRenk("Beyaz")
                .withBeygirGucu(200).build();
        System.out.println(araba);
    }
}