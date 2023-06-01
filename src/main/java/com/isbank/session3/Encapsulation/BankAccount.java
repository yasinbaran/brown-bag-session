package com.isbank.session3.Encapsulation;

public class BankAccount {
    private double balance;  // Private, bu sınıfın dışından erişilemez.

    public void deposit(double amount) {  // Public, her yerden erişilebilir.
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {  // Public, her yerden erişilebilir.
        if(amount > 0 && amount <= balance)
            balance -= amount;
    }

    public double getBalance() {  // Public, her yerden erişilebilir.
        return balance;
    }
}
    