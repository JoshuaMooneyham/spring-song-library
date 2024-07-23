package com.jmooneyham.Module1.Service;

import com.jmooneyham.Module1.Model.Song;
import com.jmooneyham.Module1.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/* Service Layer is where the database requests are sent from */

@Service
public class SongService {

    @Autowired
    SongRepository songRepo;

    public List<Song> getAllSongs() {
        return songRepo.findAll();
    }

    public Song getById(Long id) {
        if (songRepo.findById(id).isPresent()) {
            return songRepo.findById(id).get();
        }
        return null;
    }

    public Song addSong(Song song) {
        return songRepo.save(song);
    }

    public  Song updateSong(Song song) {
        if (songRepo.findById(song.getSong_id()).isPresent()) {
            return songRepo.save(song);
        }
        return null;
    }

    public void deleteSong(Long id) {
        songRepo.deleteById(id);
    }
}
