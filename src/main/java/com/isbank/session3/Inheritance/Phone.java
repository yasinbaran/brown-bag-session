package com.isbank.session3.Inheritance;

// The "Phone" class inherits from the "Electronics" class
public class Phone extends Electronics {
    private String operatingSystem;

    public Phone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // The "Phone" class overrides the 'powerOn' method of the "Electronics" class
    @Override
    public void powerOn() {
        System.out.println("The phone is powering on...");
    }
}
