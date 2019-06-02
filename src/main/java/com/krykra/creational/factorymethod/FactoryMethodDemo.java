package com.krykra.creational.factorymethod;

import com.krykra.creational.factorymethod.creator.AirMail;
import com.krykra.creational.factorymethod.creator.GroundMail;
import com.krykra.creational.factorymethod.creator.GroundTransportType;
import com.krykra.creational.factorymethod.creator.Mail;

import java.util.Objects;

public class FactoryMethodDemo {
    private static Mail mail;

    public void run() {
        setUp("other");
        callLogic();
    }

    private void setUp(String mailingFactoryType) {
        if (Objects.equals(mailingFactoryType, "Ground")) {
            mail = new GroundMail(GroundTransportType.TRAIN);
        } else {
            mail = new AirMail();
        }
    }

    private void callLogic() {
        mail.handleDelivery();
    }
}
