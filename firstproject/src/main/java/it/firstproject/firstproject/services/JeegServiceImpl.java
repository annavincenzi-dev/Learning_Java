package it.firstproject.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import it.firstproject.firstproject.models.Arm;
import it.firstproject.firstproject.models.Jeeg;
import it.firstproject.firstproject.models.Leg;
import it.firstproject.firstproject.repositories.JeegRepository;

@Component("jeegService")
public class JeegServiceImpl implements JeegService {

    @Autowired
    private JeegRepository repository;

    public JeegRepository getRepository() {
        return repository;
    }

    public void setRepository(JeegRepository repository) {
        this.repository = repository;
    }

    @Override
    public void attack() {
        if (this.repository.getJeeg() != null) {
            System.out.println("Attacco!");
        }
    }

    @Override
    public void move() {
        if (this.repository.getJeeg() != null) {
            System.out.println("Muovo!");
        }
    }

}
