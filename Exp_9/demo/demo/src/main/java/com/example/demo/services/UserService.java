package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class UserService {
    private ArrayList<User> userList = new ArrayList<User>(
            Arrays.asList(
                    new User(1, "Ayham Hashesh"),
                    new User(2, "Rajaie Imseeh") ));

    public ArrayList<User> getUserList() {
        return this.userList;
    }

    public String sayHello() {
        return "hello";
    }

    public boolean addUserToUserList (User user) {
        return userList.add(user);
    }

    public boolean deleteUserToUserList(Integer id) {
        return userList.removeIf(user -> user.getId().equals(id));
    }

    public boolean updateUserToUserList(User user, Integer id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(id)) {
                userList.set(i, user);
                return true;
            }
        }
        return false;
    }
}
