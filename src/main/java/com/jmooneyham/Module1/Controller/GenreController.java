package com.jmooneyham.Module1.Controller;

import com.jmooneyham.Module1.Model.Genre;
import com.jmooneyham.Module1.Service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    @Autowired
    GenreService genreService;

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenre();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable Long id) {
        return genreService.getById(id);
    }

    @PostMapping
    public Genre createGenre(@RequestBody Genre genre) {
        return genreService.addGenre(genre);
    }

    @PutMapping("/{id}")
    public Genre updateGenre(@RequestBody Genre genre, @PathVariable Long id) {
        return genreService.updateGenre(genre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable Long id) {
        genreService.deleteGenre(id);
    }
}
