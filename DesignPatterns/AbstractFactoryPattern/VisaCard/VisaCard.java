package DesignPatterns.AbstractFactoryPattern.VisaCard;

import DesignPatterns.AbstractFactoryPattern.PaymentType.PaymentType;

public class VisaCard implements PaymentType  {

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        System.out.println("Payment Done using VisaCard");
    }
    
}
