package com.isbank.session3.Generics;

public class Main {
    public static void main(String[] args) {
        

        Box box = new Box();
        box.put("Hello");

        Object value = box.get();   
        String str = (String) value; // Tür dönüşümü yapmak zorundayız

        //Generic
        BoxGeneric<String> stringBox = new BoxGeneric<>(); 
        stringBox.put("Hello");
        
        String valueGeneric = stringBox.get(); // Tür uyumlu şekilde veriyi alabiliriz





        Pair person = new Pair("John", 25);
        String name = (String) person.getFirst();
        Integer age = (Integer) person.getSecond();
        System.out.println("Name: " + name);    
        System.out.println("Age: " + age);



        PairGeneric<String, Integer> personGeneric = new PairGeneric<>("John", 25);
        String nameGeneric = personGeneric.getFirst();
        Integer ageGeneric = personGeneric.getSecond();
        System.out.println("Name: " + nameGeneric);
        System.out.println("Age: " + ageGeneric);

    }
}
