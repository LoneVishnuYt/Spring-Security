package com.securityproject.security;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class model {
    @Id
    private int id;
    private String name;
    private String mail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
