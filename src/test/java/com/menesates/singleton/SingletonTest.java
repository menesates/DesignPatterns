package com.menesates.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void singletonTest(){
        for (int i = 0; i < 10; i++){
            Singleton.getInstance().printThis();
        }
    }

}