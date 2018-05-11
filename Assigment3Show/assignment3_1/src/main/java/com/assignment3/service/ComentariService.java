package com.assignment3.service;

import com.assignment3.model.Comentari;
import com.assignment3.persistence.ComentariPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ComentariService {

    @Autowired
    private ComentariPersistence showPersistence;

    public List<Comentari> getComentaris() {
        return showPersistence.getComentari();
    }

    public void addComentari(Comentari show) {
        showPersistence.addComentari(show);
    }

    public void editComentari(Comentari show) {
        showPersistence.editComentari(show);
    }

    public void deleteComentari(Integer showID) {
        showPersistence.deleteComentari(showID);
    }

    public Comentari getComentari(Integer showID) {
        return showPersistence.getComentariById(showID);
    }
}
