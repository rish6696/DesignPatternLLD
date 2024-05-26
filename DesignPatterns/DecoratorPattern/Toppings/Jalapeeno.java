package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.BasePizza.BasePizza;
import DesignPatterns.DecoratorPattern.ToppingsDecorator.ToppingsDecorator;

public class Jalapeeno extends ToppingsDecorator {

    BasePizza basePizza;
    public Jalapeeno(BasePizza base){
        this.basePizza = base;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 33;
       
    }
}
