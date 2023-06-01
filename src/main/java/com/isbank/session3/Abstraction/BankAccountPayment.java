package com.isbank.session3.Abstraction;

public class BankAccountPayment extends PaymentMethod {
    public BankAccountPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println(getAmount() + " amount is paid from the bank account.");
    }
}