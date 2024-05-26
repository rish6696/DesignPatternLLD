package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.AbstractPaymentFactory.AbstractPaymentFactory;
import DesignPatterns.AbstractFactoryPattern.GenerateAbstracrtFactory.GenerateAbstractFactory;
import DesignPatterns.AbstractFactoryPattern.PaymentType.PaymentType;

public class payment {
    /*
     * Factory Pattern is a type of Creational Pattern, here We create a class which is 
     * responsible for creating object for concrete classes, As the COde Goes Bigger , we moight be 
     * creating objects of concrete classes at multiple places. And There will be always some Logical 
     * if/else or switch logic which will be responsible to decided which concreate class's 
     * object we should to create. So instead of having that at multiple places int eh code base 
     * we use Factory pattern , which helps us to remove the redundancy from the code. 
     * 
     * 
     * 
     * 
     * Abstract factory Pattern, In abstract factory pattern, the concrete classes which are comes in same
     * category are grouped into groups. Now here we have multiple factories which belong to each group, and 
     * the factory for that group is responsible for creating objects for that group. So here we have factory of Factories. 
     * 
     * 
     * So here there will be one AbstractFactoryCreator Class, and then concrete factoryClases which will implement
     *   AbstractFactoryCreator and then thsi concrete factory classes will be responsible for creating concrete objects for 
     * payment methods. 
     */
    public static void main(String[] args) {
        AbstractPaymentFactory paymentFactory = new GenerateAbstractFactory().GenerateFactory("A");
        PaymentType mode = paymentFactory.GetPaymentMode("PU");
        mode.pay();

    }
}
