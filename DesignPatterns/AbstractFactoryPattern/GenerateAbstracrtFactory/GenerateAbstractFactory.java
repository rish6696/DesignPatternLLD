package DesignPatterns.AbstractFactoryPattern.GenerateAbstracrtFactory;

import DesignPatterns.AbstractFactoryPattern.AbstractPaymentFactory.AbstractPaymentFactory;
import DesignPatterns.AbstractFactoryPattern.GroupAPaymentFactory.GroupAPaymentFactory;

public class GenerateAbstractFactory {
    public AbstractPaymentFactory GenerateFactory(String input){
        switch (input) {
            case "A":
                return new GroupAPaymentFactory();
            default:
                return null;
        }

    }
}
