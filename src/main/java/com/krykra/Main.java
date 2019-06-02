package com.krykra;

import com.krykra.creational.factorymethod.FactoryMethodDemo;

public class Main {

    public static void main(String[] args) {
        tryFactoryMethod();
    }

    private static void tryFactoryMethod() {
        FactoryMethodDemo factoryMethodDemo = new FactoryMethodDemo();
        factoryMethodDemo.run();
    }
}
