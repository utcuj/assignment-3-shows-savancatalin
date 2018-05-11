package com.assignment3.persistence;

import com.assignment3.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public class UserPersistence {

    @Autowired
    private SessionFactory sessionFactory;

    public User getUser(Integer id) {
        Session session = sessionFactory.openSession();
        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }

    public User findUser(String username) {
        Session session = sessionFactory.openSession();
        User user = (User) session.createQuery("FROM User where username = (:username)").setParameter("username", username).uniqueResult();
        session.close();
        return user;
    }

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        List<User> users;
        Session session = sessionFactory.openSession();
        users = session.createCriteria(User.class).list();
        session.close();
        return users;
    }

    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.close();
    }


    public void editUser(User user) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(user);
        session.flush();
        session.close();
    }

    public void deleteUser(Integer id) {
        Session session = sessionFactory.openSession();
        session.delete(getUser(id));
        session.flush();
        session.close();
    }
}
