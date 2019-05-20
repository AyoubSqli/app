package com.app.demo.services;

import com.app.demo.entities.Client;
import com.app.demo.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService  {
    List<Client> getAllUsers();
    Client getUserById(Long id);
    Client getUserByUsername(String userName);
}
