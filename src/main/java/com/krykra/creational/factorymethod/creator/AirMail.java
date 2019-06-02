package com.krykra.creational.factorymethod.creator;

import com.krykra.creational.factorymethod.product.Package;
import com.krykra.creational.factorymethod.product.Plane;
import com.krykra.creational.factorymethod.product.Transport;

public class AirMail extends Mail {

    @Override
    public Transport createTransport() {
        Plane plane = new Plane();
        plane.fillWithPackage(new Package("Sent via plane"));
        return plane;
    }
}
