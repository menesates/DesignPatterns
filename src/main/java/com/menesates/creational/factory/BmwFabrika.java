package com.menesates.creational.factory;

public class BmwFabrika extends ArabaFabrika {
    @Override
    public void createAuto() {
        getArabaListesi().add(new Z4(170));
    }
}
