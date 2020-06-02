package com.menesates.creational.objectpool;

public class NoConnectionInPool extends Throwable {
    public NoConnectionInPool() {
        System.out.println("Pool'da Connection bulunmuyor");
    }
}
