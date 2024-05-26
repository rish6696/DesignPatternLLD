package DesignPatterns.FactoryPAttern.Stripe;

import DesignPatterns.FactoryPAttern.PaymentType.PaymentType;

public class Stripe implements PaymentType {

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        System.err.println("Payment Done Using Stripe");
    }
    
}
