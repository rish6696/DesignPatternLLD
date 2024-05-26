package DesignPatterns.FactoryPAttern.VisaCard;

import DesignPatterns.FactoryPAttern.PaymentType.PaymentType;

public class VisaCard implements PaymentType  {

    @Override
    public void pay() {
        // TODO Auto-generated method stub
        System.out.println("Payment Done using VisaCard");
    }
    
}
