package com.nhlstenden.jallersma.maventemplate;

public class User {
    private final String username;

    public User(String username) {
        this.username = username;
    }

    public void log(String action) {
        System.out.format("[SECURITY] Requested %s by user '%s'.\n", action, username);
    }
}
