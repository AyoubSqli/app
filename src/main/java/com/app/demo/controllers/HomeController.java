package com.app.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String getHomePage(Model model)
    {
        return  "index" ;
    }
    @RequestMapping("/hello")
    public String getHelloPage(Model model)
    {
        return  "hello" ;
    }

}
