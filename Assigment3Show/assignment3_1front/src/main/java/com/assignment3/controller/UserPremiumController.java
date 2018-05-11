package com.assignment3.controller;

import com.assignment3.model.Comentari;
import com.assignment3.model.Film;
import com.assignment3.model.Subscribe;
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
public class UserPremiumController {

    @RequestMapping(value = "/userpremium", method = RequestMethod.GET)
    public String home(Model model) {
        return "userpremium";
    }

    /////////////////////comentari///////////////////////
    @RequestMapping(value = "/subscribe", method = RequestMethod.GET)
    public String showSubscribes(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Subscribe[]> responseEntity = restTemplate.getForEntity("http://localhost:8181/shows-1/subscribes", Subscribe[].class);
        Subscribe[] users = responseEntity.getBody();
        model.addAttribute("subscribes", users);
        return "viewSubscribes";
    }

    @RequestMapping(value = "/addSubscribe", method = RequestMethod.GET)
    public String showAddSubscribe(Model model) {
        return "addSubscribe";
    }

    @RequestMapping(value = "/addSubscribe", method = RequestMethod.POST)
    public String addSubscribe(@ModelAttribute("Subscribe") Subscribe user) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Subscribe> request = new HttpEntity<>(user, headers);
        restTemplate.postForEntity( "http://localhost:8181/shows-1/addSubscribe", request , Subscribe.class );
        return "redirect:subscribe";
    }

    @RequestMapping(value = "/deleteSubscribe/{userId}", method = RequestMethod.POST)
    public String deleteSubscribe(@PathVariable Integer userId) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange("http://localhost:8181/shows-1/deleteSubscribe/" + userId, HttpMethod.DELETE, null, Subscribe.class);
        return "redirect:/subscribe";
    }
    
    /////////////////////comentari///////////////////////
    @RequestMapping(value = "/comentariup", method = RequestMethod.GET)
    public String showComentaris(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Comentari[]> responseEntity = restTemplate.getForEntity("http://localhost:8181/shows-1/comentari", Comentari[].class);
        Comentari[] users = responseEntity.getBody();
        model.addAttribute("comentarisup", users);
        return "viewComentariUserP";
    }

    @RequestMapping(value = "/addComentariup", method = RequestMethod.GET)
    public String showAddComentari(Model model) {
        return "addComentariup";
    }

    @RequestMapping(value = "/addComentariup", method = RequestMethod.POST)
    public String addComentari(@ModelAttribute("Comentariu") Comentari user) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Comentari> request = new HttpEntity<>(user, headers);
        restTemplate.postForEntity( "http://localhost:8181/shows-1/addComentari", request , Comentari.class );
        return "redirect:comentariup";
    }

    @RequestMapping(value = "/deleteComentariup/{userId}", method = RequestMethod.POST)
    public String deleteComentari(@PathVariable Integer userId) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange("http://localhost:8181/shows-1/deleteComentari/" + userId, HttpMethod.DELETE, null, Comentari.class);
        return "redirect:/comentariup";
    }
    ///////////////////////////filme//////////////////////////
    
    @RequestMapping(value = "/userpfilms", method = RequestMethod.GET)
    public String showFilmsUser(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Film[]> responseEntity = restTemplate.getForEntity("http://localhost:8181/shows-1/films", Film[].class);
        Film[] users = responseEntity.getBody();
        model.addAttribute("userpfilms", users);
        return "viewFilmsUserp";
    }

    
    
    ///////////////////////////tipuridefilme//////////////////////////
    
    @RequestMapping(value = "/userptipfilms", method = RequestMethod.GET)
    public String showtipFilmsUser(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TipFilm[]> responseEntity = restTemplate.getForEntity("http://localhost:8181/shows-1/filmtipes", TipFilm[].class);
        TipFilm[] users = responseEntity.getBody();
        model.addAttribute("userptipfilms", users);
        return "viewTipFilmsUserp";
    }

}
