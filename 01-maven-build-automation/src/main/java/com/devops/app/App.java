package com.devops.app;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {

        String message = "  DevOps Maven Project  ";

        System.out.println("Original: '" + message + "'");

        String trimmed = StringUtils.trim(message);

        System.out.println("Trimmed: '" + trimmed + "'");

        int length = trimmed.length();

        System.out.println("Length: " + length);

        if(length > 10){
            System.out.println("Message is long");
        } else {
            System.out.println("Message is short");
        }
    }
}