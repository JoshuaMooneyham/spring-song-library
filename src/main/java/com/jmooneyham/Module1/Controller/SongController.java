package com.jmooneyham.Module1.Controller;

import com.jmooneyham.Module1.Model.Song;
import com.jmooneyham.Module1.Repository.SongRepository;
import com.jmooneyham.Module1.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    SongService songService;

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {
        return songService.getById(id);
    }

    @PostMapping
    public Song createSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @PutMapping("/{id}")
    public Song updateSong(@RequestBody Song song, @PathVariable Long id) {
        return songService.updateSong(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
    }
}
