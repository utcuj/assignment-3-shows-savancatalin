package com.assignment3.controller;

import com.assignment3.model.Film;
import com.assignment3.model.TipFilm;
import com.assignment3.model.User;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;



@Controller
public class AdminController {

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String home(Model model) {
        return "admin";
    }
    ////////////////////////useri//////////////////
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String showUsers(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity("http://localhost:8181/shows-1/users", User[].class);
        User[] users = responseEntity.getBody();
        model.addAttribute("users", users);
        return "viewUsers";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String showAddUser(Model model) {
        return "addUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<User> request = new HttpEntity<>(user, headers);
        restTemplate.postForEntity( "http://localhost:8181/shows-1/addUser", request , User.class );
        return "redirect:users";
    }

    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.POST)
    public String deleteUser(@PathVariable Integer userId) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange("http://localhost:8181/shows-1/delete/" + userId, HttpMethod.DELETE, null, User.class);
        return "redirect:/users";
    }

    @RequestMapping(value = "/editUser/{userId}", method = RequestMethod.GET)
    public String showEditUser(Model model, @PathVariable Integer userId) {
        RestTemplate restTemplate = new RestTemplate();
        User user  = restTemplate.getForObject("http://localhost:8181/shows-1/user/" + userId, User.class);
        model.addAttribute("user", user);
        return "editUser";
    }

    @RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public String editUser(Model model, @ModelAttribute("user") User user) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<User> request = new HttpEntity<>(user, headers);
        restTemplate.exchange( "http://localhost:8181/shows-1/editUser", HttpMethod.PUT, request , User.class );
        return "redirect:users";
    }

    /////////////////////film///////////////////////
    @RequestMapping(value = "/films", method = RequestMethod.GET)
    public String showFilms(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Film[]> responseEntity = restTemplate.getForEntity("http://localhost:8181/shows-1/films", Film[].class);
        Film[] users = responseEntity.getBody();
        model.addAttribute("films", users);
        return "viewFilms";
    }

    @RequestMapping(value = "/addFilm", method = RequestMethod.GET)
    public String showAddFilm(Model model) {
        return "addFilm";
    }

    @RequestMapping(value = "/addFilm", method = RequestMethod.POST)
    public String addFilm(@ModelAttribute("film") Film user) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Film> request = new HttpEntity<>(user, headers);
        restTemplate.postForEntity( "http://localhost:8181/shows-1/addFilm", request , Film.class );
        return "redirect:films";
    }

    @RequestMapping(value = "/deleteFilm/{userId}", method = RequestMethod.POST)
    public String deleteFilm(@PathVariable Integer userId) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange("http://localhost:8181/shows-1/deleteFilm/" + userId, HttpMethod.DELETE, null, Film.class);
        return "redirect:/films";
    }

    @RequestMapping(value = "/editFilm/{userId}", method = RequestMethod.GET)
    public String showEditFilm(Model model, @PathVariable Integer userId) {
        RestTemplate restTemplate = new RestTemplate();
        Film user  = restTemplate.getForObject("http://localhost:8181/shows-1/film/" + userId, Film.class);
        model.addAttribute("film", user);
        return "editFilm";
    }

    @RequestMapping(value = "/editFilm", method = RequestMethod.POST)
    public String editFilm(Model model, @ModelAttribute("film") Film user) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<Film> request = new HttpEntity<>(user, headers);
        restTemplate.exchange( "http://localhost:8181/shows-1/editFilm", HttpMethod.PUT, request , Film.class );
        return "redirect:films";
    }
    
    @RequestMapping(value = "/tipfilms", method = RequestMethod.GET)
    public String showtipFilmsUser(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TipFilm[]> responseEntity = restTemplate.getForEntity("http://localhost:8181/shows-1/filmtipes", TipFilm[].class);
        TipFilm[] users = responseEntity.getBody();
        model.addAttribute("tipfilms", users);
        return "viewTipFilms";
    }
}
