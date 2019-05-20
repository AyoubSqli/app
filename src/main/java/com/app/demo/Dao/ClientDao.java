package com.app.demo.Dao;

import com.app.demo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ClientDao extends JpaRepository<Client,Long> {
    @Query(value = "SELECT c From Client c WHERE c.username= :userName ")
    Client findByUserName(@Param("userName") String userName);
}
