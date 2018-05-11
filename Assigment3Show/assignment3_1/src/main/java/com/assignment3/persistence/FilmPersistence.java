package com.assignment3.persistence;

import com.assignment3.model.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public class FilmPersistence {

    @Autowired
    private SessionFactory sessionFactory;

    public Film getFilmById(Integer id) {
        Session session = sessionFactory.openSession();
        Film show = (Film) session.get(Film.class, id);
        session.close();
        return show;
    }

    public Film findFilm(String name) {
        Session session = sessionFactory.openSession();
        Film show = (Film) session.createQuery("FROM Show where name = (:name)").setParameter("name", name).uniqueResult();
        session.close();
        return show;
    }

    @SuppressWarnings("unchecked")
    public List<Film> getFilms() {
        List<Film> shows;
        Session session = sessionFactory.openSession();
        shows = session.createCriteria(Film.class).list();
        session.close();
        return shows;
    }

    public void addFilm(Film shows) {
        Session session = sessionFactory.openSession();
        session.save(shows);
        session.close();
    }


    public void editFilm(Film show) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(show);
        session.flush();
        session.close();
    }

    public void deleteFilm(Integer id) {
        Session session = sessionFactory.openSession();
        session.delete(getFilmById(id));
        session.flush();
        session.close();
    }
}
