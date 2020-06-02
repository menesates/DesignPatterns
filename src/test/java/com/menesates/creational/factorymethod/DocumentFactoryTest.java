package com.menesates.creational.factorymethod;

import org.junit.Test;

public class DocumentFactoryTest {

    @Test
    public void documentFactoryTest(){
        Document document = DocumentFactory.createDocument("PDF");
        System.out.println(document.getDocumentType());

        Document word = DocumentFactory.createDocument("WORD");
        System.out.println(word.getDocumentType());
    }

}