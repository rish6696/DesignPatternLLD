package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.BasePizza.BasePizza;
import DesignPatterns.DecoratorPattern.ToppingsDecorator.ToppingsDecorator;

public class Mushroom extends ToppingsDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza base){
        this.basePizza = base;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
    
}
