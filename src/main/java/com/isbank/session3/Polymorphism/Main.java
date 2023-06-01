package com.isbank.session3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.move();         // Output: The car drives.
        myMotorcycle.move();  // Output: The motorcycle speeds.
    }
}
