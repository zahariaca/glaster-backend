package com.zahariaca.glassterbackend.controller;

import com.zahariaca.glassterbackend.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping(produces = "application/json")
    @RequestMapping("/validateLogin")
    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/search"})
    public User validateLogin() {
        return new User("User successfully authenticated!");
    }
}
