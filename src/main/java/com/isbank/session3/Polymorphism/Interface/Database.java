package com.isbank.session3.Polymorphism.Interface;

public interface Database {
    void connect();
    void disconnect();
    void executeQuery(String query);
}
