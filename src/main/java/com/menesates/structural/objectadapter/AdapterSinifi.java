package com.menesates.structural.objectadapter;

public class AdapterSinifi extends KullanilanSinif {

    private AdapteEdilenSinif adapteEdilenSinif = new AdapteEdilenSinif();

    @Override
    public void birMetod() {
        getAdapteEdilenSinif().herHangiBirMetod();
    }

    private AdapteEdilenSinif getAdapteEdilenSinif() {
        return adapteEdilenSinif;
    }

}
