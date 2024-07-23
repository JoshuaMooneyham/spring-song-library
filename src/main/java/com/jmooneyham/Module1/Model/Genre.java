package com.jmooneyham.Module1.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genre_id;

    private String genre_tag;

    @JsonIgnore
    @ManyToMany(mappedBy = "song_genres")
    private Set<Song> genre_songs = new HashSet<>();

    public Genre() {

    }

    public Genre(String tag) {
        this.genre_tag = tag;
    }

    public Long getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Long genre_id) {
        this.genre_id = genre_id;
    }

    public String getGenre_tag() {
        return genre_tag;
    }

    public void setGenre_tag(String genre_tag) {
        this.genre_tag = genre_tag;
    }

    public Set<Song> getGenre_songs() {
        return genre_songs;
    }

    public void setGenre_songs(Set<Song> genre_songs) {
        this.genre_songs = genre_songs;
    }
}
