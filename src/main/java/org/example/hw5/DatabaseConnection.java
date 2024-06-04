package org.example.hw5;

public class DatabaseConnection {
    private DatabaseConnection instance;

    private DatabaseConnection() {
    }

    public synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
            return instance;
        }
        return instance;
    }
}
