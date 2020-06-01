package com.menesates.builder.siparis;

import com.menesates.builder.araba.Araba;
import com.menesates.builder.araba.Marka;
import com.menesates.builder.araba.Model;
import org.junit.Test;

import static org.junit.Assert.*;

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