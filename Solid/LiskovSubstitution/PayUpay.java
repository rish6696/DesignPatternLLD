package Solid.LiskovSubstitution;

public class PayUpay implements PaymentMethod {
    public void pay() {
        System.out.println("Payment done using PayUpay");
        throw new RuntimeException("Payment failed");
    }
}
