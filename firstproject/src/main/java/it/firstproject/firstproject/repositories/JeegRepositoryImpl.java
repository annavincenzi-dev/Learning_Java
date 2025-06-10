package it.firstproject.firstproject.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.firstproject.firstproject.models.Jeeg;

@Repository("jeegRepository")
public class JeegRepositoryImpl implements JeegRepository {

    /** Dependency injection del modello jeeg */
    @Autowired
    private Jeeg jeeg;

    @Override
    public Jeeg getJeeg() {
        return this.jeeg;
    }

    @Override
    public void setJeeg(Jeeg jeeg) {
        this.jeeg = jeeg;
    }

}
