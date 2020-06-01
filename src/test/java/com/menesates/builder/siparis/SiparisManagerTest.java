package com.menesates.builder.siparis;

import com.menesates.builder.araba.Araba;
import org.junit.Test;

import static org.junit.Assert.*;

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