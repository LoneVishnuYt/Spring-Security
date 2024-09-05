package com.securityproject.security;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Dao dao;
    public List<model> getAll() {
        return dao.findAll();
    }

    public void postAll(model user) {
        dao.save(user);
    }
}
