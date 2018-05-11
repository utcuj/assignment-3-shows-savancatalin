package com.assignment3.controller;

import com.assignment3.model.Film;
import com.assignment3.model.TipFilm;
import com.assignment3.model.User;
import com.assignment3.service.FilmService;
import com.assignment3.service.TipFilmService;
import com.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class AdminController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private FilmService showService;
    
    @Autowired
    private TipFilmService tipService;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User>
    getUser(@PathVariable Integer userId) {
        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);
        return new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(value = "/editUser", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> editUser(@RequestBody User user) {
        userService.editUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/films", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Film> getShows() {
        return showService.getFilms();
    }

    @RequestMapping(value = "/film/{showId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film>
    getShow(@PathVariable Integer showId) {
        return new ResponseEntity<>(showService.getFilm(showId), HttpStatus.OK);
    }

    @RequestMapping(value = "/addFilm", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> addShow(@RequestBody Film show) {
        showService.addFilm(show);
        return new ResponseEntity<>(show, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteFilm/{showId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteFilm(@PathVariable Integer showId) {
        showService.deleteFilm(showId);
        return new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(value = "/editFilm", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> editShow(@RequestBody Film show) {
        showService.editFilm(show);
        return new ResponseEntity<>(show, HttpStatus.OK);
    }
    
    //////////////////tipuri de filme////////////////////////
    @RequestMapping(value = "/filmtipes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<TipFilm> getTipFilms() {
        return tipService.getTipFilms();
    }

    @RequestMapping(value = "/filmtipe/{showId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipFilm>
    getTipFilm(@PathVariable Integer showId) {
        return new ResponseEntity<>(tipService.getTipFilm(showId), HttpStatus.OK);
    }

    @RequestMapping(value = "/addTipFilm", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipFilm> addTipFilm(@RequestBody TipFilm show) {
        tipService.addTipFilm(show);
        return new ResponseEntity<>(show, HttpStatus.OK);
    }

}
