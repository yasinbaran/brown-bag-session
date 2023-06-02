package com.isbank.session3.Encapsulation;

public class Employee {
    Person person;
  
    public void printName() {
        System.out.println(person.firstName + " " + person.lastName);  // Employee sınıfı, Person sınıfının firstName ve lastName değişkenlerine erişebilir.
    }
}
