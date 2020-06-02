package com.menesates.creational.prototype;

import com.menesates.creational.prototype.adres.Adres;
import org.junit.Test;

public class AdresPrototypeTest {

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        final Adres adres = new Adres("Ataürk Cad", "10", "Atasehir", "İstanbul");

        adres.printAdress();

        final Adres adres2 = (Adres) adres.clone();
        adres2.setSokak("Ulus Cad");
        adres2.setNo("120");
        adres2.setSemt("Kadikoy");
        adres2.setSehir("İstanbul");

        adres2.printAdress();


    }

}