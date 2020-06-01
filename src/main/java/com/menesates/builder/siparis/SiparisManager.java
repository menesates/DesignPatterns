package com.menesates.builder.siparis;

import com.menesates.builder.araba.Araba;

public class SiparisManager {
    private SiparisBuilder builder;

    public Araba createOrder(final String marka,
                             final String model,
                             final String renk,
                             final int beygirGucu){
        if (marka.equals("Ford")){
            builder = new FordSiparisBuilder();
        }
        else if (marka.equals("Audi")){
            builder = new AudiSiparisBuilder();
        }

        builder.setMarka(marka);
        builder.setModel(model);
        builder.setRenk(renk);
        builder.setBeygirGucu(beygirGucu);

        return builder.getAraba();
    }

    public void printOrder(){
        System.out.println("Marka: " + builder.getAraba().getMarka());
        System.out.println("Model: " + builder.getAraba().getModel());
        System.out.println("Renk: " + builder.getAraba().getRenk());
        System.out.println("Beygir Gücü: " + builder.getAraba().getBeygirGucu());
    }
}
