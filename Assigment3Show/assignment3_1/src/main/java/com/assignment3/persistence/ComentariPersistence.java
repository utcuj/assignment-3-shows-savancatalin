package com.assignment3.persistence;

import com.assignment3.model.Comentari;
import com.assignment3.model.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ComentariPersistence {

    @Autowired
    private SessionFactory sessionFactory;

    public Comentari getComentariById(Integer id) {
        Session session = sessionFactory.openSession();
        Comentari show = (Comentari) session.get(Comentari.class, id);
        session.close();
        return show;
    }

    @SuppressWarnings("unchecked")
    public List<Comentari> getComentari() {
        List<Comentari> shows;
        Session session = sessionFactory.openSession();
        shows = session.createCriteria(Comentari.class).list();
        session.close();
        return shows;
    }

    public void addComentari(Comentari shows) {
        Session session = sessionFactory.openSession();
        session.save(shows);
        session.close();
    }


    public void editComentari(Comentari show) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(show);
        session.flush();
        session.close();
    }

    public void deleteComentari(Integer id) {
        Session session = sessionFactory.openSession();
        session.delete(getComentariById(id));
        session.flush();
        session.close();
    }
}
