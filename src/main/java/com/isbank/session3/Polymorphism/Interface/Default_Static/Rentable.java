package com.isbank.session3.Polymorphism.Interface.Default_Static;

public interface Rentable {
    void rent();
    
    default void extendRent(int extraDays) {
        System.out.println("Rent extended for " + extraDays + " extra days.");
    }

    static Rentable createDefaultRentable() {
        return new Car(); // assume Car is a class that implements Rentable
    }
}
