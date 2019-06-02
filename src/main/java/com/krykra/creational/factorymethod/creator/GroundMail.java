package com.krykra.creational.factorymethod.creator;

import com.krykra.creational.factorymethod.product.Package;
import com.krykra.creational.factorymethod.product.Train;
import com.krykra.creational.factorymethod.product.Transport;
import com.krykra.creational.factorymethod.product.Truck;

public class GroundMail extends Mail {
    private GroundTransportType transportType;

    public GroundMail(GroundTransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public Transport createTransport() {
        if (transportType == GroundTransportType.TRAIN) {
            return createTrain();
        }

        return createTruck();
    }

    private Truck createTruck() {
        Truck truck = new Truck();
        truck.fillWithPackage(new Package("Sent via Truck"));
        return truck;
    }

    private Train createTrain() {
        Train train = new Train();
        train.fillWithPackage(new Package("Sent via Train"));
        return train;
    }
}
