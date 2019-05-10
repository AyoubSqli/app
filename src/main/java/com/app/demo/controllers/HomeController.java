package com.app.demo.controllers;

import com.app.demo.Dao.UserDao;
import com.app.demo.entities.Client;
import com.app.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private UserDao userDao ;
    @RequestMapping("/hello")
    public String getHelloPage(Model model)
    {
      /*  userDao.save(new Client("test1","test1","test1@mail.com","test1","test1"));
        userDao.save(new Client("test2","test2","test2@mail.com","test2","test2"));
        userDao.save(new Client("test3","test3","test3@mail.com","test3","test3"));
        userDao.save(new Client("test4","test4","test4@mail.com","test4","test4"));*/
        List<User> users = userDao.findAll();
        return  "hello" ;
    }
    @RequestMapping("/index")
    public String getIndex(Model model)
    {
        model.addAttribute("text","just a text for testing ");
        return "index" ;
    }
}
