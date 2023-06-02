package com.isbank.session3.Polymorphism;

public class Account {
    private double balance;

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void deposit(double amount, String transactionDate) {
        // Assume we also do something with transactionDate here
        if(amount > 0) {
            balance += amount;
        }
    }
}
