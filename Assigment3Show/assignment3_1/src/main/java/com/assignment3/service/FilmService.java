package com.assignment3.service;

import com.assignment3.model.Film;
import com.assignment3.persistence.FilmPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class FilmService {

    @Autowired
    private FilmPersistence showPersistence;

    public List<Film> getFilms() {
        return showPersistence.getFilms();
    }

    public void addFilm(Film show) {
        showPersistence.addFilm(show);
    }

    public void editFilm(Film show) {
        showPersistence.editFilm(show);
    }

    public void deleteFilm(Integer showID) {
        showPersistence.deleteFilm(showID);
    }

    public Film getFilm(Integer showID) {
        return showPersistence.getFilmById(showID);
    }
}
