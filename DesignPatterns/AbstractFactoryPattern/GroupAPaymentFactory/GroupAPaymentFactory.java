package DesignPatterns.AbstractFactoryPattern.GroupAPaymentFactory;

import DesignPatterns.AbstractFactoryPattern.AbstractPaymentFactory.AbstractPaymentFactory;
import DesignPatterns.AbstractFactoryPattern.PayU.PayU;
import DesignPatterns.AbstractFactoryPattern.PaymentType.PaymentType;
import DesignPatterns.AbstractFactoryPattern.RazorPay.Razorpay;
import DesignPatterns.AbstractFactoryPattern.Stripe.Stripe;
import DesignPatterns.AbstractFactoryPattern.VisaCard.VisaCard;

public class GroupAPaymentFactory implements AbstractPaymentFactory {

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
