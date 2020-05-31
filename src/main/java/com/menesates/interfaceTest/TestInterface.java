package com.menesates.interfaceTest;

public interface TestInterface {

    void existingMethod();


    default void newDefaultMethod() {
        System.out.println("Test");
    }
}
