package com.app.demo.controllers;

import com.app.demo.entities.Client;
import com.app.demo.entities.Employee;
import com.app.demo.entities.User;
import com.app.demo.services.EmployeeService;
import com.app.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeFormsController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/login")
    public String getLoginForm(Model model, @ModelAttribute(name = "username") String username,@ModelAttribute(name = "password") String password)
    {
        Employee employee = employeeService.getEmployeeByUserName(username) ;
                if(employee ==null)
                {
                    model.addAttribute("error"," Incorrect UserName Or Password , Please Verify you're Informations");
                    return "index" ;
                }else
                {
                    model.addAttribute("employee",employee);
                    return "hello" ;
                }
    }
}
