package com.menesates.creational.factorymethod;

public class Pdf implements Document {

    @Override
    public String getDocumentType() {
        return "Pdf";
    }
}
