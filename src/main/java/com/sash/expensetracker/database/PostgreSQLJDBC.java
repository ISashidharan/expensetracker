package com.sash.expensetracker.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class PostgreSQLJDBC {

    public static void main (String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb",
                    "postgres", "123");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println("Database opened successfully!");
    }

}
