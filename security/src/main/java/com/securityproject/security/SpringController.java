package com.securityproject.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("spring/")
@CrossOrigin("*")
public class SpringController {

    @GetMapping("/")
    public  String getmessage(){
        return ("<h1>Welcomr to Spring Security </h1>");
    }

    @GetMapping("user")
    public  String getuser(){
        return ("<h1>Login or Sign up</h1>");
    }
    @GetMapping("admin")
    public  String getadmin(){
        return ("<h1>ADMIN LOGIN</h1>");
    }
    @Autowired
    Service service;
    @GetMapping("getAll")
    public List<model> getAll(){
        return service.getAll();
    }
    @PostMapping("add")
    public void postUser(@RequestBody model user){
        service.postAll(user);
    }
}
