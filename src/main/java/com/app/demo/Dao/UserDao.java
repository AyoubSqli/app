package com.app.demo.Dao;

import com.app.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface UserDao extends JpaRepository<User,Long> {
    @Query(value = "SELECT u From User u WHERE u.username= :userName")
    List<User> findByUserName(@Param("userName") String userName);
}
