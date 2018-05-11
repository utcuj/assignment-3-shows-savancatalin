package com.assignment3.service;

import com.assignment3.model.User;
import com.assignment3.persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LogInService {

    @Autowired
    private UserPersistence userPersistence;

    public User findUser(String user) {
        User dbUser = userPersistence.findUser(user);
        if (dbUser != null ) {
            return dbUser;
        }
        return null;
    }
}

