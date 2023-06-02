package com.isbank.session3.Inheritance;

public class Electronics {
    private String brand;
    private String model;

    public Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void powerOn() {
        System.out.println("The device is powering on...");
    }
}
