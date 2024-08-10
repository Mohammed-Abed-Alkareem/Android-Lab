package com.example.demo.controllers;

import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.models.User;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String sayHello() {
        return userService.sayHello();
    }

    @RequestMapping("/users") public ArrayList<User> getAllUsers() {
        return userService.getUserList();
    }

    @RequestMapping(method= RequestMethod.POST, value="/users")
    public boolean addUser(@RequestBody User user) {
        return userService.addUserToUserList(user);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/users/{id}")
    public boolean deleteUser(@PathVariable Integer id) {
        // Delete with id from the User Service Array List
        return userService.deleteUserToUserList(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/users/{id}")
    public boolean updateUser(@RequestBody User user,@PathVariable Integer id) {
        // Update with id in the User Service Array List }
        return userService.updateUserToUserList(user, id);
    }

}
