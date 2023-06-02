package com.isbank.session3.Inheritance;

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Creating an object of the Animal class
        Animal myDog = new Dog(); // Creating an object of the Dog class

        myAnimal.makeSound(); // Output: The animal makes a sound...
        myDog.makeSound(); // Output: The dog barks...




        //------2------- 

        Computer computer = new Computer("Apple", "MacBook Pro", "macOS");
        System.out.println("Computer brand: " + computer.getBrand());
        System.out.println("Computer model: " + computer.getModel());
        System.out.println("Computer operating system: " + computer.getOperatingSystem());
        computer.powerOn();

        Phone phone = new Phone("Samsung", "Galaxy S30", "Android");
        System.out.println("\nPhone brand: " + phone.getBrand());
        System.out.println("Phone model: " + phone.getModel());
        System.out.println("Phone operating system: " + phone.getOperatingSystem());
        phone.powerOn();

    }
}