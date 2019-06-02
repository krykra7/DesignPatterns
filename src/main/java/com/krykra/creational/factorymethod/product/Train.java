package com.krykra.creational.factorymethod.product;

public class Train implements Transport {
    private Package aPackage;

    @Override
    public void deliver() {
        System.out.println(aPackage.getContent());
    }

    @Override
    public void fillWithPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
