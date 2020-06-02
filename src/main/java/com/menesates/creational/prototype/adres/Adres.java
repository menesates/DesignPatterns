package com.menesates.creational.prototype.adres;

import com.menesates.creational.prototype.AdresPrototype;

public class Adres extends AdresPrototype {

    public Adres(final String sokak, final String no, final String semt, final String sehir) {
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
    }

}
