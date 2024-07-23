package com.jmooneyham.Module1.Service;

import com.jmooneyham.Module1.Model.Genre;
import com.jmooneyham.Module1.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* Service Layer is where the database requests are sent from */

@Service
public class GenreService {

    @Autowired
    GenreRepository genreRepo;

    public List<Genre> getAllGenre() {
        return genreRepo.findAll();
    }

    public Genre getById(Long id) {
        if (genreRepo.findById(id).isPresent()) {
            return genreRepo.findById(id).get();
        }
        return null;
    }

    public Genre addGenre(Genre genre) {
        return genreRepo.save(genre);
    }

    public  Genre updateGenre(Genre genre) {
        if (genreRepo.findById(genre.getGenre_id()).isPresent()) {
            return genreRepo.save(genre);
        }
        return null;
    }

    public void deleteGenre(Long id) {
        genreRepo.deleteById(id);
    }
}
