package com.example.util;

public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String repeat(String str, int times) {
        if (str == null || times <= 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(str);
        }
        return builder.toString();
    }
}
