package com.menesates.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArabaFabrikaTest {

    @Test
    public void testFabrika(){
        ArabaFabrika bmw = new BmwFabrika();
        ArabaFabrika audi = new AudiFabrika();

        for (final Araba araba :
                bmw.getArabaListesi()) {
            System.out.println(araba.getMarka() + " " + araba.getModel() + ", " + araba.getBeygirGucu() );
        }

        for (final Araba araba :
                audi.getArabaListesi()) {
            System.out.println(araba.getMarka() + " " + araba.getModel() + ", " + araba.getBeygirGucu() );
        }
    }

    @Test
    public void testFabrika2(){
        /*ArabaFabrika audi = new AudiFabrika();
        audi.getArabaListesi().add(new A4(1));*/
        AudiFabrika audiFabrika = new AudiFabrika();
        audiFabrika.getArabaListesi().add(new A4(120));
        audiFabrika.getArabaListesi().add(new R8(350));

        showCar(audiFabrika);
    }

    private void showCar(AudiFabrika audiFabrika) {
        for (Araba araba :
                audiFabrika.getArabaListesi()) {
            System.out.println(araba.getMarka() + " " + araba.getModel() + ", " + araba.getBeygirGucu() );
        }
    }
}