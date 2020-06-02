package com.menesates.prototype.adres;

import com.menesates.prototype.AdresPrototype;

public class SahisAdres extends AdresPrototype {

    private String isim;
    private String soyad;

    public SahisAdres(final String sokak, final String no, final String semt, final String sehir, final String isim, final String soyad) {
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
        setIsim(isim);
        setSoyad(soyad);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
