package com.isbank.session3.Abstraction;

public class Main {
    public static void main(String[] args) {
        PaymentMethod payment = new BankAccountPayment(100.0);
        payment.pay();

        payment = new CreditCardPayment(200.0);
        payment.pay();

        payment = new CashPayment(300.0);
        payment.pay();
    }
}
