package com.app.demo.Dao;

import com.app.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeDao extends JpaRepository<Employee,Long> {
    @Query(value = "SELECT  e From Employee e where e.username =:userName")
    Employee getEmployeeByUsername(@Param("userName") String userName) ;

}
