package com.isbank.session3.Encapsulation;

public class Dog extends Animal {
    // ...
    public void increaseAge() {
        age++;  // Dog sınıfı, Animal sınıfının age değişkenine erişebilir.
    }
}
