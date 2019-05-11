package com.app.demo.services.Impl;

import com.app.demo.Dao.UserDao;
import com.app.demo.entities.User;
import com.app.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao ;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> getUserByUsername(String userName) {
        return userDao.findByUserName(userName);
    }
}
