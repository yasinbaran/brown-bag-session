package com.isbank.session3.Abstraction;

public abstract class PaymentMethod {
    private double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void pay();
}
