package com.example.app;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {
    private Map<String, String> userDatabase = new HashMap<>();

    public void saveUser(String username, String hashedPassword) {
        userDatabase.put(username, hashedPassword);
        System.out.println("Saved user: " + username);
    }

    public String getUser(String username) {
        return userDatabase.get(username);
    }
}
