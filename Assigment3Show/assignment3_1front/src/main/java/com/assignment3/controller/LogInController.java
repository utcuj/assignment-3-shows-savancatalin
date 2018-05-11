package com.assignment3.controller;

import com.assignment3.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;



@Controller
public class LogInController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(Model model) {
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showUser(Model model, @PathVariable User user) {
        RestTemplate restTemplate = new RestTemplate();
        User dbUser  = restTemplate.getForObject("http://localhost:8181/shows-1/login", User.class);
        if (dbUser != null) {
        	if (dbUser.getType() == "admin") {
                return "redirect:/admin";
            }
            if (dbUser.getType() == "user") {
                return "redirect:/usernormal";
            }
            if (dbUser.getType() == "userpremium") {
            	return "redirect:/userpremium";
            }
        }
        return "redirect:/usernormal";
    }
}



