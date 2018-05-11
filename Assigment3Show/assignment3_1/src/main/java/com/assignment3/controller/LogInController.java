package com.assignment3.controller;

import com.assignment3.model.User;
import com.assignment3.service.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LogInController {

    @Autowired
    private LogInService logInService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, @ModelAttribute("user") String userModel) {
        User dbUser = logInService.findUser(userModel);
        if (dbUser != null) {
            if (dbUser.getType() == "admin") {
                return "admin";
            }
            if (dbUser.getType() == "user") {
                return "usernormal";
            }
            	else
                return "userpremium";
            }
		return null;
        } 
}

