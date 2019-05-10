package com.app.demo.controllers;

import com.app.demo.entities.User;
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
    private UserService userService ;
    @RequestMapping("/login")
    public String getLoginForm(Model model, @ModelAttribute(name = "username") String username,@ModelAttribute(name = "password") String password)
    {
        List<User> users = userService.getUserByUsername(username) ;
        System.out.println(users.size());
                if(users.isEmpty())
                {
                    model.addAttribute("user","null");
                }else
                {
                    model.addAttribute("user",users.get(0));
                }
        return "hello" ;
    }
}
