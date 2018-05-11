package com.assignment3.controller;

import com.assignment3.model.Film;
import com.assignment3.model.Subscribe;
import com.assignment3.model.User;
import com.assignment3.service.FilmService;
import com.assignment3.service.SubscribeService;
import com.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
public class UserPremiumController {

    @Autowired
    private SubscribeService subscribeService;
    


    @RequestMapping(value = "/subscribes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Subscribe> getSubscribes() {
        return subscribeService.getSubscribes();
    }

    @RequestMapping(value = "/subscribe/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subscribe>
    getSubscribe(@PathVariable Integer userId) {
        return new ResponseEntity<>(subscribeService.getSubscribe(userId), HttpStatus.OK);
    }

    @RequestMapping(value = "/addSubscribe", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subscribe> addSubscribe(@RequestBody Subscribe user) {
    	subscribeService.addSubscribe(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteSubscribe/{userId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteSubscribe(@PathVariable Integer userId) {
    	subscribeService.deleteSubscribe(userId);
        return new ResponseEntity(HttpStatus.OK);
    }




}
