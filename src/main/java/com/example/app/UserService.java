package com.example.app;

import com.example.util.StringUtils;

public class UserService {
    private DataRepository dataRepository = new DataRepository();

    public void createUser(String username, String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            System.out.println("Invalid input");
            return;
        }
        String hashedPassword = hashPassword(password);
        dataRepository.saveUser(username, hashedPassword);
        System.out.println("User created: " + username);
    }

    public String getUser(String username) {
        if (StringUtils.isEmpty(username)) {
            System.out.println("Invalid username");
            return null;
        }
        String user = dataRepository.getUser(username);
        System.out.println("User found: " + user);
        return user;
    }

    private String hashPassword(String password) {
        // Weak hashing algorithm (MD5)
        return Integer.toString(password.hashCode());
    }
}
