package Solid.LiskovSubstitution;

public class Stripe implements PaymentMethod {
    public void pay() {
        System.out.println("Payment done using Stripe");
    }
}
