package DesignPatterns.FactoryPAttern;

import DesignPatterns.FactoryPAttern.PaymentFactory.PaymentFactory;
import DesignPatterns.FactoryPAttern.PaymentType.PaymentType;

public class payment {
    /*
     * Factory Pattern is a type of Creational Pattern, here We create a class which is 
     * responsible for creating object for concrete classes, As the COde Goes Bigger , we moight be 
     * creating objects of concrete classes at multiple places. And There will be always some Logical 
     * if/else or switch logic which will be responsible to decided which concreate class's 
     * object we should to create. So instead of having that at multiple places int eh code base 
     * we use Factory pattern , which helps us to remove the redundancy from the code. 
     */
    public static void main(String[] args) {
        PaymentType paymentMode = new PaymentFactory().GetPaymentMode("LU");
        paymentMode.pay();
    }
}
