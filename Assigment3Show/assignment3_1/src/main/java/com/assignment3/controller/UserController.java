package com.assignment3.controller;

import com.assignment3.model.Comentari;
import com.assignment3.model.Film;
import com.assignment3.model.User;
import com.assignment3.service.ComentariService;
import com.assignment3.service.FilmService;
import com.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
public class UserController {

    @Autowired
    private ComentariService comentariService;
    

    @RequestMapping(value = "/comentari", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Comentari> getComentari() {
        return comentariService.getComentaris();
    }
    
    @RequestMapping(value = "/comentari/{showId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Comentari>getComentari(@PathVariable Integer showId) {
        return new ResponseEntity<>(comentariService.getComentari(showId), HttpStatus.OK);
    }


    @RequestMapping(value = "/addComentari", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Comentari> addComentari(@RequestBody Comentari user) {
    	comentariService.addComentari(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteComentari/{userId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteComentari(@PathVariable Integer userId) {
    	comentariService.deleteComentari(userId);
        return new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(value = "/editComentari", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Comentari> editComentari(@RequestBody Comentari user) {
    	comentariService.editComentari(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
