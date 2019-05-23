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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeFormsController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/login")
    public String getLoginForm(Model model, @ModelAttribute(name = "username") String username, @ModelAttribute(name = "password") String password , HttpServletRequest servletRequest)
    {
        HttpSession session = servletRequest.getSession() ;
        Employee employee = employeeService.getEmployeeByUserName(username) ;
                if(employee ==null && session.getAttribute("userName") !=  null)
                {
                    model.addAttribute("error"," Incorrect UserName Or Password , Please Verify you're Informations");
                    return "index" ;
                }else
                {
                    if(employee!=null)
                    {
                        model.addAttribute("employee",employee);
                        session.setAttribute("userName",employee.getUsername());
                        return "hello" ;
                    }
                    return "index" ;
                }
    }
}
