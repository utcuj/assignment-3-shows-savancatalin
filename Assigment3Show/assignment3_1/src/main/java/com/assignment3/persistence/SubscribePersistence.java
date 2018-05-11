package com.assignment3.persistence;

import com.assignment3.model.Subscribe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SubscribePersistence {

    @Autowired
    private SessionFactory sessionFactory;

    public Subscribe getSubscribeById(Integer id) {
        Session session = sessionFactory.openSession();
        Subscribe show = (Subscribe) session.get(Subscribe.class, id);
        session.close();
        return show;
    }

    public Subscribe findSubscribe(Integer id) {
        Session session = sessionFactory.openSession();
        Subscribe show = (Subscribe) session.createQuery("FROM subscribe where iduser = (:id)").setParameter("id", id).uniqueResult();
        session.close();
        return show;
    }

    @SuppressWarnings("unchecked")
    public List<Subscribe> getSubscribes() {
        List<Subscribe> shows;
        Session session = sessionFactory.openSession();
        shows = session.createCriteria(Subscribe.class).list();
        session.close();
        return shows;
    }

    public void addSubscribe(Subscribe shows) {
        Session session = sessionFactory.openSession();
        session.save(shows);
        session.close();
    }


    public void editSubscribe(Subscribe show) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(show);
        session.flush();
        session.close();
    }

    public void deleteSubscribe(Integer id) {
        Session session = sessionFactory.openSession();
        session.delete(getSubscribeById(id));
        session.flush();
        session.close();
    }
}
