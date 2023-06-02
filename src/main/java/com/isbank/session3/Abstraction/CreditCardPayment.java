package com.isbank.session3.Abstraction;

public class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println(getAmount() + " amount is paid using credit card.");
    }
}