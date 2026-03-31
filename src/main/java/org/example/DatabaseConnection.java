package org.example;

public class DatabaseConnection {

    // Single instance
    private static DatabaseConnection instance;

    // Private constructor
    private DatabaseConnection() {
        System.out.println("Database Connection Created");
    }

    // Method to access the single instance
    public static DatabaseConnection getInstance() {

        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connected to database...");
    }
}