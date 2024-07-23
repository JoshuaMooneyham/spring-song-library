package com.jmooneyham.Module1.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artist_id;

    private String artist_name;

    @JsonIgnore
    @OneToMany(mappedBy = "song_artist", cascade = CascadeType.ALL)
    private Set<Song> artist_songs = new HashSet<>();

    public Artist() {

    }

    public Artist(String name) {
        this.artist_name = name;
    }

    public Long getArtist_id() {
        return artist_id;
    }

    public Set<Song> getArtist_songs() {
        return artist_songs;
    }

    public void setArtist_songs(Set<Song> artist_songs) {
        this.artist_songs = artist_songs;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }
}
