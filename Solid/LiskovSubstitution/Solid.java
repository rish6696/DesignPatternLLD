package Solid.LiskovSubstitution;

public class Solid {
    public static void main(String[] args) {
        PaymentMethod payUpay = new PayUpay();
        PaymentMethod razorpay = new Razorpay();
        PaymentMethod stripe = new Stripe();

        // Accordign to liskov subustition we should be able to replace the object of parent 
        // with the object of child class without affecting the functionality of the program.

        // when a class extends to parent class, it not should narrow the functionality of the parent class.
        // In this case, the payUpay class is extending the PaymentMethod class and it is throwing a runtime exception.
        // This is a violation of the Liskov Substitution Principle.


        // Here payUpay has broken the Liskov Substitution Principle,
        // as it throws a runtime exception, which is not expected by the caller.
        // This is a violation of the Liskov Substitution Principle.
        // The caller expects the pay() method to be executed without any exceptions.
        // The caller does not expect the pay() method to throw any exceptions.
        // The caller expects the pay() method to be executed without any exceptions.
        // The caller does not expect the pay() method to throw any exceptions.
        // The caller expects the pay() method to be executed without any exceptions.

        PaymentMethod[] paymentMethods = {payUpay, razorpay, stripe};
        for (PaymentMethod paymentMethod : paymentMethods) {
            enroll(paymentMethod);
        }
        
    }

    public static void enroll(PaymentMethod paymentMethod){
        paymentMethod.pay();
    }
}