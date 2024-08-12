package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;
    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return service.getAll();
    }
    @PostMapping("/users")
    public String addOne(@RequestBody User user) {
        return service.addUser(user);
    }

    @DeleteMapping("/users")
    public String deleteOne(@RequestBody User user) {
        return service.deleteUser(user.getId());
    }



}