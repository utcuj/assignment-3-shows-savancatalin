package com.assignment3.persistence;

import com.assignment3.model.TipFilm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public class TipFilmPersistence {

    @Autowired
    private SessionFactory sessionFactory;

    public TipFilm getTipFilmById(Integer id) {
        Session session = sessionFactory.openSession();
        TipFilm show = (TipFilm) session.get(TipFilm.class, id);
        session.close();
        return show;
    }

    public TipFilm findTipFilm(String name) {
        Session session = sessionFactory.openSession();
        TipFilm show = (TipFilm) session.createQuery("FROM tipfilm where name = (:name)").setParameter("name", name).uniqueResult();
        session.close();
        return show;
    }

    @SuppressWarnings("unchecked")
    public List<TipFilm> getTipFilms() {
        List<TipFilm> shows;
        Session session = sessionFactory.openSession();
        shows = session.createCriteria(TipFilm.class).list();
        session.close();
        return shows;
    }

    public void addTipFilm(TipFilm shows) {
        Session session = sessionFactory.openSession();
        session.save(shows);
        session.close();
    }


    public void editTipFilm(TipFilm show) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(show);
        session.flush();
        session.close();
    }

    public void deleteTipFilm(Integer id) {
        Session session = sessionFactory.openSession();
        session.delete(getTipFilmById(id));
        session.flush();
        session.close();
    }
}
