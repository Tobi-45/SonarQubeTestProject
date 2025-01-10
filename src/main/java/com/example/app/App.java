package com.example.app;

import com.example.util.StringUtils;

public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.createUser("admin", "password123");
        userService.getUser("admin");
    }
}
