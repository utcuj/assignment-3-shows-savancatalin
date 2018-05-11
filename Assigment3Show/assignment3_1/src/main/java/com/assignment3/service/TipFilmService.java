package com.assignment3.service;

import com.assignment3.model.TipFilm;
import com.assignment3.persistence.TipFilmPersistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class TipFilmService {

    @Autowired
    private TipFilmPersistence showPersistence;

    public List<TipFilm> getTipFilms() {
        return showPersistence.getTipFilms();
    }

    public void addTipFilm(TipFilm show) {
        showPersistence.addTipFilm(show);
    }

    public void editTipFilm(TipFilm show) {
        showPersistence.editTipFilm(show);
    }

    public void deleteTipFilm(Integer showID) {
        showPersistence.deleteTipFilm(showID);
    }

    public TipFilm getTipFilm(Integer showID) {
        return showPersistence.getTipFilmById(showID);
    }
}
