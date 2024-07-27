package com.restaurent.mangment.service;

import com.restaurent.mangment.model.restaurent;
import com.restaurent.mangment.repo.restaurentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class restaurentService {
    private final restaurentRepo repo;


    public restaurentService(restaurentRepo repo) {
        this.repo = repo;
    }

    public void insertRestaurent(restaurent Restaurent) {
        repo.save(Restaurent);
    }

    public restaurent UpdateRestaurent(restaurent Restaurent) {
        return repo.save(Restaurent);
    }

    public void deleteRestaurent(Long id) {
        repo.deleteById(id);
    }

    public restaurent FindtRestaurent(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<restaurent> getAllRestaurants() {
        return repo.findAll();
    }

}
