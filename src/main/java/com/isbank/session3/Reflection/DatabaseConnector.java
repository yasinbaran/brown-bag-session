package com.isbank.session3.Reflection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.lang.reflect.Field;

public class DatabaseConnector {
    private Connection connection;
    private Boolean isConnected = false;

    public void connect(String driverClassName, String url, Properties props) throws Exception {
        // Load the driver class dynamically
        Class.forName(driverClassName);

        // Connect to the database
        connection = DriverManager.getConnection(url, props);

        // Using Reflection to access the private field and modify its value
        Field isConnectedField = this.getClass().getDeclaredField("isConnected");
        isConnectedField.setAccessible(true);
        isConnectedField.set(this, true);
    }

    public Boolean getConnectionStatus() {
        return this.isConnected;
    }

    // Other methods using the connection...

    public static void main(String[] args) {
        DatabaseConnector connector = new DatabaseConnector();

        Properties props = new Properties();
        props.put("user", "username");
        props.put("password", "password");

        try {
            // Connect to a MySQL database
            connector.connect("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mydb", props);
            System.out.println("Connection status: " + connector.getConnectionStatus());
            // Now we can use `connector` to interact with the database...

            // To switch to a PostgreSQL database, we just need to call `connect` with a different driver:
            // connector.connect("org.postgresql.Driver", "jdbc:postgresql://localhost/mydb", props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
