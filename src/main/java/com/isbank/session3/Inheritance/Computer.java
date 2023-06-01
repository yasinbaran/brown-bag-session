package com.isbank.session3.Inheritance;

// The "Computer" class inherits from the "Electronics" class
public class Computer extends Electronics {
    private String operatingSystem;

    public Computer(String brand, String model, String operatingSystem) {
        super(brand, model);  // 'super' calls the constructor of the parent class
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // The "Computer" class overrides the 'powerOn' method of the "Electronics" class
    @Override
    public void powerOn() {
        System.out.println("The computer is powering on...");
    }
}