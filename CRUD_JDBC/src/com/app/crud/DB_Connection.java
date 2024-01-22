package com.app.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private static final String URL = "jdbc:mysql://localhost:3306/CRUD";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "100units";

    public static Connection createConnection() {
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established.");
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately in a real application.
        }

        return connection;
    }
}
