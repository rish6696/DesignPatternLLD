package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.BasePizza.BasePizza;
import DesignPatterns.DecoratorPattern.Toppings.ExtraCheese;
import DesignPatterns.DecoratorPattern.Toppings.Jalapeeno;
import DesignPatterns.DecoratorPattern.Toppings.Mushroom;
import DesignPatterns.DecoratorPattern.VegDelight.VegDelight;

public class Shop {

    /*
     * Why We needed Decorator Pattern ?
     * So lets Suppose I have a Class BasePizza now there can be a pizza with CheeseTOpings, Mushroom Topic,
     * JalppenoTopings, Cheese+mushrrom, Cheese+Jalppeno , Cheese _+ jalpeeno + Extra veggies. 
     * 
     * So there can multiple combinations of Toppings which can be possible and It  is difficult to Create Multiple 
     * Classes with all Permutation and Combination. And this problem is termed a Class Explosion. We cannot create multiple
     * Child Classes with Different Combinations. 
     * 
     * 
     * To Solve this We Bring the Decoratoe Pattern. 
     * 
     * 
     * Here We have have the One Abstraxt Class which is a BasePizza, And then Concrete classes like , VegDelight And margherita Pizza
     * 
     * And we create a  classs which extends the BasePizza termed as TopingsDecorator. 
     * 
     * Now here toppings Decorator is Having a IS a relationship with BaseClass. 
     * 
     * Now we create Concrete Classes for Different Topings we have by inherting ToppingClass. AND NOW THE MOST Imp thing here is 
     * the concrete classes for topings will  have a HAS relation shiup with BasePizza, they will be having the reference of base 
     * pizza in the class. So InDEcorator Pattern WE HAVE A IS_A AS WELL AS HAS_A Relationship. 
     * 
     * 
     * IS_A Relationship is established by the Abstract Toping Class By Extending the BasePizaa
     * HAS_A Rwlationship is established by the Concreate claases By having the Reference to BasePizza
     * 
     * 
     * Now when we create actual objects we wrap the concreate Objects like new Jalapeeno(new ExtraCheese(new VegDelight())).
     * 
     * Refer the below Code for Expalnation. 
     */
    public static void main(String[] args) {
        BasePizza vegDelightWithCheese = new ExtraCheese(new VegDelight());
        int cost =  vegDelightWithCheese.cost();

        // add a topping of Jalapeeno also. 
        BasePizza vegDelightWithJalapeenoAndCheese = new Jalapeeno(vegDelightWithCheese);



        // Now one mor e combination is vegDelight+mushrooms. 
        BasePizza vegDelightCheeseAndMushroom = new Mushroom(vegDelightWithCheese);

        System.out.println("Cost for the piza is " + vegDelightWithJalapeenoAndCheese.cost());
        System.out.println("Cost for the piza is " + vegDelightCheeseAndMushroom.cost() );
    }
}
