package com.isbank.session3.Abstraction;

public class CashPayment extends PaymentMethod {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println(getAmount() + " amount is paid in cash.");
    }
}