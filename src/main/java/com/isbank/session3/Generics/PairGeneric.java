package com.isbank.session3.Generics;

public class PairGeneric<T, U> {
    private T first;
    private U second;

    public PairGeneric(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
