package com.codegym.controller;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.persistence.LoginImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginUser {
    LoginImpl loginImpl = new LoginImpl();
    @GetMapping(value = "/show-form-login")
    public String showFormLogin(Model model){


        return "/form";
    }

    @PostMapping("/login")
    public String login(@RequestParam("user") String user, @RequestParam("pass") String pass, Model model){
        Login login = new Login(user, pass);
        if(loginImpl.checkLogin(login)== null){
            return "/error";
        } else {
            model.addAttribute("user", loginImpl.checkLogin(login));
            return "/login";
        }
    }
    @GetMapping(value = "/error")
    public String error(Model model){


        return "/error";
    }

}
