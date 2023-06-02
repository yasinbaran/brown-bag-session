package com.isbank.session3.Encapsulation;

public class Cat extends Animal {
    // ...
    public void increaseWeight(double increment) {
        weight += increment;  // Cat sınıfı, Animal sınıfının weight değişkenine erişebilir.
    }
}