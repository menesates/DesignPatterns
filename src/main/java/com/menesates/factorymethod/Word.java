package com.menesates.factorymethod;

public class Word implements Document {

    @Override
    public String getDocumentType() {
        return "Word";
    }
}
