package com.krykra.creational.factorymethod.product;

public class Truck implements Transport {
    private Package aPackage;

    @Override
    public void deliver() {
        System.out.println(aPackage);
    }

    @Override
    public void fillWithPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
