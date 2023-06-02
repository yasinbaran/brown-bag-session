package com.isbank.session3.Generics;

public class BoxGeneric<T> {
    private T content;

    public void put(T item) {
        this.content = item;
    }

    public T get() {
        return content;
    }
}
