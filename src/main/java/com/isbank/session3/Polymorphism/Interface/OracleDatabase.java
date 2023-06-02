package com.isbank.session3.Polymorphism.Interface;

public class OracleDatabase implements Database {
    // OracleDatabase specific methods and variables
    
    @Override
    public void connect() {
        // OracleDatabase specific connect
    }

    @Override
    public void disconnect() {
        // OracleDatabase specific disconnect
    }

    @Override
    public void executeQuery(String query) {
        // OracleDatabase specific executeQuery
    }
}
