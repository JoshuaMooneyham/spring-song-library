package com.jmooneyham.Module1.Service;

import com.jmooneyham.Module1.Model.Artist;
import com.jmooneyham.Module1.Model.Song;
import com.jmooneyham.Module1.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* Service Layer is where the database requests are sent from */

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepo;

    public List<Artist> getAllArtist() {
        return artistRepo.findAll();
    }

    public Artist getById(Long id) {
        if (artistRepo.findById(id).isPresent()) {
            return artistRepo.findById(id).get();
        }
        return null;
    }

    public Artist addArtist(Artist artist) {
        return artistRepo.save(artist);
    }

    public  Artist updateArtist(Artist artist) {
        if (artistRepo.findById(artist.getArtist_id()).isPresent()) {
            return artistRepo.save(artist);
        }
        return null;
    }

    public void deleteArtist(Long id) {
        artistRepo.deleteById(id);
    }
}
