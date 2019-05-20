package com.app.demo.services;

import com.app.demo.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeByUserName(String userName);
    Employee getEmployeeById(Long Id);
    List<Employee> getAllEmployees() ;
}
