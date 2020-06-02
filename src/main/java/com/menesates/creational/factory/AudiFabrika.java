package com.menesates.creational.factory;

public class AudiFabrika extends ArabaFabrika {
    @Override
    public void createAuto() {
        getArabaListesi().add(new A4(120));
        getArabaListesi().add(new R8(350));
    }
}
