package com.app.demo.services.Impl;

import com.app.demo.Dao.ClientDao;
import com.app.demo.entities.Client;
import com.app.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public List<Client> getAllUsers() {
        return clientDao.findAll();
    }

    @Override
    public Client getUserById(Long id) {
        return clientDao.findById(id).get();
    }

    @Override
    public Client getUserByUsername(String userName) {
        return clientDao.findByUserName(userName);
    }
}
