package com.app.demo.dao;

import com.app.demo.entities.User;

import java.util.List;

public interface UserDao {

    User getUserById(Long id) ;

    List<User> getALlUsers() ;

}
