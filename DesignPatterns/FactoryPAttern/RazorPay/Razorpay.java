package DesignPatterns.FactoryPAttern.RazorPay;

import DesignPatterns.FactoryPAttern.PaymentType.PaymentType;

public class Razorpay implements PaymentType {

    @Override
    public void pay() {
        System.out.println("Payment COmpleted Via RazorpAy");
    }
    
}
