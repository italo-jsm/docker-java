package com.example.demo.domain;

import java.util.Arrays;
import java.util.List;

public class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public static List<User> createUsersList(){
        return Arrays.asList(
                new User("Italo", "italojunqueira87@gmail.com"),
                new User("Jose", "jose@gmail.com"),
                new User("Paulo", "paulo@gmail.com"),
                new User("Ana", "ana@gmail.com"),
                new User("Maria", "maria@gmail.com")
        );
    }
}
