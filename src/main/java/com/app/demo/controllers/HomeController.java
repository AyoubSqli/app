package com.app.demo.controllers;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("/hello")
public class HomeController {

    @GetMapping
    public ModelAndView getHelloPage(@AuthenticationPrincipal final UserDetails userDetails)
    {
        ModelAndView mav = new ModelAndView("hello");
        String username = userDetails.getUsername();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        mav.addObject("authorities",authorities) ;
        return  mav ;
    }

}
