package com.assignment3.service;

import com.assignment3.model.Subscribe;
import com.assignment3.persistence.SubscribePersistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SubscribeService {

    @Autowired
    private SubscribePersistence showPersistence;

    public List<Subscribe> getSubscribes() {
        return showPersistence.getSubscribes();
    }

    public void addSubscribe(Subscribe show) {
        showPersistence.addSubscribe(show);
    }

    public void editSubscribe(Subscribe show) {
        showPersistence.editSubscribe(show);
    }

    public void deleteSubscribe(Integer showID) {
        showPersistence.deleteSubscribe(showID);
    }

    public Subscribe getSubscribe(Integer showID) {
        return showPersistence.getSubscribeById(showID);
    }
}
