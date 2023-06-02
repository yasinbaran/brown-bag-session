package com.isbank.session3.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        

    // ArrayList oluşturma ve eleman ekleme
    List<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("C++");
    System.out.println(list);

    // HashSet oluşturma ve eleman ekleme
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    System.out.println(set);

    // HashMap oluşturma ve eleman ekleme
    Map<String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);
    System.out.println(map);

    }
}
