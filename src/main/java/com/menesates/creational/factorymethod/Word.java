package com.menesates.creational.factorymethod;

public class Word implements Document {

    @Override
    public String getDocumentType() {
        return "Word";
    }
}
