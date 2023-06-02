package com.isbank.session3.Generics;

public class Box {
    private Object content;

    public void put(Object item) {
        this.content = item;
    }

    public Object get() {
        return content;
    }
}
