package com.menesates.structural.objectadapter;

public class KullaniciSinif {

    public static void main(String[] args) {

        /*KullanilanSinif kullanilanSinif = KullanilanSinifFactory.instance();
        kullanilanSinif.birMetod()

        public  KullanilanSinif instance() {        return new AdapterSinifi();    }

        */

        final KullanilanSinif kullanilanSinif = new AdapterSinifi();
        kullanilanSinif.birMetod();
    }
}
