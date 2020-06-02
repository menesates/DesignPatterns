package com.menesates.creational.prototype.adres;

import com.menesates.creational.prototype.AdresPrototype;

public class FirmaAdres extends AdresPrototype {

    private String firma;

    public FirmaAdres(final String sokak, final String no, final String semt, final String sehir, final String firma) {
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
        setFirma(firma);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
