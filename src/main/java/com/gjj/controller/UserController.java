package com.gjj.controller;

import com.gjj.pojo.User;
import com.gjj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/add")
    public String addUser(User user, Model model){
        userService.addUser(user);
        model.addAttribute(user);
        return "showUser";
    }
}
