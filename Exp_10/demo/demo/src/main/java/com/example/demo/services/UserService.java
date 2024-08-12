package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> getAll() {
        return userRepository.findAll();
    }
    public String addUser(User user) {
        userRepository.save(user);
        return "success";
    }

    public String deleteUser(Integer userId) { userRepository.deleteById(userId);
        return "success";
    }

}
