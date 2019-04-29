package com.app.demo.dao.Impl;

import com.app.demo.dao.UserDao;
import com.app.demo.entities.User;

import java.util.List;

public class defaultUserDao implements UserDao {
    @Override
    public User getUserById(Long id) {
        return null ;
    }

    @Override
    public List<User> getALlUsers() {
        return null;
    }
}
