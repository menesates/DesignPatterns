package com.menesates.creational.singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void singletonTest(){
        for (int i = 0; i < 10; i++){
            Singleton.getInstance().printThis();
        }
    }

}