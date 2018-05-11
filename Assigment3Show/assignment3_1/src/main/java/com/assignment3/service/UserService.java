package com.assignment3.service;

import com.assignment3.model.User;
import com.assignment3.persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserService {

    @Autowired
    private UserPersistence userPersistence;

    public List<User> getUsers() {
        return userPersistence.getUsers();
    }

    public void addUser(User user) {
        userPersistence.addUser(user);
    }

    public void editUser(User user) {
        userPersistence.editUser(user);
    }

    public void deleteUser(Integer userID) {
        userPersistence.deleteUser(userID);
    }

    public User getUser(Integer userID) {
        return userPersistence.getUser(userID);
    }
}
