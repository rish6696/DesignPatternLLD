package DesignPatterns.AbstractFactoryPattern.AbstractPaymentFactory;

import DesignPatterns.AbstractFactoryPattern.PaymentType.PaymentType;

public interface AbstractPaymentFactory {
    public PaymentType GetPaymentMode(String key);
}


