package DesignPatterns.FactoryPAttern.PayU;

import DesignPatterns.FactoryPAttern.PaymentType.PaymentType;

public class PayU implements PaymentType {

    @Override
    public void pay() {
        // TODO Auto-generated method stub
       System.out.println("Payment Done using PayU");
    }
}
