package com.menesates.creational.builder.siparis;

import com.menesates.creational.builder.araba.Araba;
import com.menesates.creational.builder.araba.Marka;
import com.menesates.creational.builder.araba.Model;

public class FluentBuilder {
    private Marka marka;
    private Model model;
    private int beygirGucu;
    private String renk;

    public static FluentBuilder startBuilding() {
        return new FluentBuilder();
    }

    public FluentBuilder withMarka(final Marka marka) {
        this.marka = marka;
        return this;
    }

    public FluentBuilder withModel(final Model model) {
        this.model = model;
        return this;
    }

    public FluentBuilder withRenk(final String renk) {
        this.renk = renk;
        return this;
    }

    public FluentBuilder withBeygirGucu(final int beygirGucu) {
        this.beygirGucu = beygirGucu;
        return this;
    }

    public Araba build() {
        final Araba araba = new Araba();
        araba.setMarka(marka);
        araba.setModel(model);
        araba.setRenk(renk);
        araba.setBeygirGucu(beygirGucu);
        return araba;
    }
}
