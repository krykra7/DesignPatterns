package com.krykra.creational.factorymethod.creator;

import com.krykra.creational.factorymethod.product.Transport;

public abstract class Mail {

    public void handleDelivery() {

        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
