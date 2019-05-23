package com.app.demo.controllers;

import com.app.demo.Dao.ClientDao;
import com.app.demo.Dao.EmployeeDao;
import com.app.demo.entities.Client;
import com.app.demo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private EmployeeDao employeeDao ;
    @Autowired
    private ClientDao clientDao;
    @RequestMapping("/hello")
    public String getHelloPage(Model model)
    {
      /*  clientDao.save(new Client("test1","test1","test1@mail.com","test1","test1"));
        clientDao.save(new Client("test2","test2","test2@mail.com","test2","test2"));
        clientDao.save(new Client("test3","test3","test3@mail.com","test3","test3"));
        clientDao.save(new Client("test4","test4","test4@mail.com","test4","test4"));
        employeeDao.save(new Employee("testUser","test2","testUser@mail.com","testUser"));
        List<Client> clients = clientDao.findAll();
        clients.forEach(c ->
        {
            System.out.println(c.getName());
        });*/
        return  "hello" ;
    }
    @RequestMapping("/index")
    public String getIndex(Model model, HttpServletRequest servletRequest)
    {
        HttpSession session = servletRequest.getSession();
        model.addAttribute("text","just a text for testing ");
        return "index" ;
    }
}
