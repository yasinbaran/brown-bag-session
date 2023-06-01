package com.isbank.session3.Encapsulation;

public class Customer {
    Person person;
    
    // ...
    public void printName() {
        System.out.println(person.firstName + " " + person.lastName);  // Customer sınıfı, Person sınıfının firstName ve lastName değişkenlerine erişebilir.
    }
}