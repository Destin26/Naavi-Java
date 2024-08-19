package com.destin.naavi.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private String id;

    private String username;

    private String email;

    public User() {}

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}