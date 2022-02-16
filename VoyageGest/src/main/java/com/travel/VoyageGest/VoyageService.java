package com.travel.VoyageGest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VoyageService {
    @Autowired
    private VoyageRepository repo;

    public List<Voyage> listAll() {
        return repo.findAll();
    }

    public void save(Voyage voyage) {
        repo.save(voyage);
    }

    public Voyage get(long idvoyage) {
        return repo.findById(idvoyage).get();
    }

    public void delete(long idvoyage) {
        repo.deleteById(idvoyage);
    }
}
