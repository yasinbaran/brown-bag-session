package com.isbank.session3.Polymorphism.Interface.Default_Static;

public interface Calculations {
    double calculateArea();

    default double calculatePerimeter() {
        System.out.println("Default perimeter calculation not available.");
        return 0;
    }

    static int add(int a, int b) {
        return a + b;
    }
}


// Bu şekilde doğrudan çağırılıyor
//int sum = Calculations.add(5, 10);  // outputs 15
