package com.jmooneyham.Module1.Controller;

import com.jmooneyham.Module1.Model.Artist;
import com.jmooneyham.Module1.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistService.getAllArtist();
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable Long id) {
        return artistService.getById(id);
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist genre) {
        return artistService.addArtist(genre);
    }

    @PutMapping("/{id}")
    public Artist updateArtist(@RequestBody Artist genre, @PathVariable Long id) {
        return artistService.updateArtist(genre);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.deleteArtist(id);
    }
}
