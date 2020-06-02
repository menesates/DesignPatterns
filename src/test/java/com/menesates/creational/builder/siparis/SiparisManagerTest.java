package com.menesates.creational.builder.siparis;

import com.menesates.creational.builder.araba.Araba;
import org.junit.Test;

public class SiparisManagerTest {

    @Test
    public void createOrder() {
        SiparisManager siparisManager = new SiparisManager();

        Araba ford = siparisManager.createOrder("Ford", "Focus", "Beyaz", 70);
        siparisManager.printOrder();
        System.out.println(ford);

        siparisManager = new SiparisManager();

        Araba audi = siparisManager.createOrder("Audi", "A5", "Siyah", 270);
        siparisManager.printOrder();
        System.out.println(audi);
    }
}