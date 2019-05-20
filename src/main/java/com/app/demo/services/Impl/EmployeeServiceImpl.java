package com.app.demo.services.Impl;

import com.app.demo.Dao.EmployeeDao;
import com.app.demo.entities.Employee;
import com.app.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao ;

    @Override
    public Employee getEmployeeByUserName(String userName) {
        return employeeDao.getEmployeeByUsername(userName);
    }

    @Override
    public Employee getEmployeeById(Long Id) {
        return employeeDao.findById(Id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }
}
