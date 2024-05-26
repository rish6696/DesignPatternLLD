package DesignPatterns.FactoryPAttern.PaymentFactory;

import DesignPatterns.FactoryPAttern.PayU.PayU;
import DesignPatterns.FactoryPAttern.PaymentType.PaymentType;
import DesignPatterns.FactoryPAttern.RazorPay.Razorpay;
import DesignPatterns.FactoryPAttern.Stripe.Stripe;
import DesignPatterns.FactoryPAttern.VisaCard.VisaCard;

public class PaymentFactory {

    /*
     * Just Mocking the Logic here , In real world Example Factory Would Get An
     * Input , based on which
     * some logic would eb applied to create the objects for concrete classes.
     */

    public PaymentType GetPaymentMode(String key) {
        switch (key) {
            case "LU":
                return new Razorpay();
            case "PU":
                return new Stripe();
            case "MU":
                return new VisaCard();
            case "EU":
                return new PayU();
            default:
                return null;
        }
    }

}
