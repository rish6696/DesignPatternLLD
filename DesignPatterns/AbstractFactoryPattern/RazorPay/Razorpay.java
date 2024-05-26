package DesignPatterns.AbstractFactoryPattern.RazorPay;

import DesignPatterns.AbstractFactoryPattern.PaymentType.PaymentType;

public class Razorpay implements PaymentType {

    @Override
    public void pay() {
        System.out.println("Payment COmpleted Via RazorpAy");
    }
    
}
