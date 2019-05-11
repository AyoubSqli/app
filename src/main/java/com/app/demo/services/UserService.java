package com.app.demo.services;

import com.app.demo.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService  {
    List<User> getAllUsers();
    User getUserById(Long id);
    List<User> getUserByUsername(String userName);
}
