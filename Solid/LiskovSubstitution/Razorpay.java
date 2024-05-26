package Solid.LiskovSubstitution;

public class Razorpay implements PaymentMethod {
    public void pay() {
        System.out.println("Payment done using Razorpay");
    }

}
