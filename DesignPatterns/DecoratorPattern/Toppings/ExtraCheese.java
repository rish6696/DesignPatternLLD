package DesignPatterns.DecoratorPattern.Toppings;

import DesignPatterns.DecoratorPattern.BasePizza.BasePizza;
import DesignPatterns.DecoratorPattern.ToppingsDecorator.ToppingsDecorator;

public class ExtraCheese extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza base){
        this.basePizza = base;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
    
}
