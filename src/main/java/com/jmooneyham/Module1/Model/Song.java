package com.jmooneyham.Module1.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/* An entity class represents a table in a relational database */

@Entity
@Table
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long song_id;

    private String song_title;

    private Integer song_length;

    @ManyToMany
    @JoinTable(name = "song_genres", joinColumns = @JoinColumn(name = "song_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> song_genres = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist song_artist;

    public Song() {

    }

    public Song(String title, Integer length, Artist artist) {
        this.song_title = title;
        this.song_length = length;
        this.song_artist = artist;
    }

    public Long getSong_id() {
        return song_id;
    }

    public void setSong_id(Long song_id) {
        this.song_id = song_id;
    }

    public String getSong_title() {
        return song_title;
    }

    public void setSong_title(String song_title) {
        this.song_title = song_title;
    }

    public Integer getSong_length() {
        return song_length;
    }

    public void setSong_length(Integer song_length) {
        this.song_length = song_length;
    }

    public Set<Genre> getSong_genres() {
        return song_genres;
    }

    public void setSong_genres(Set<Genre> song_genres) {
        this.song_genres = song_genres;
    }

    public Artist getSong_artist() {
        return song_artist;
    }

    public void setSong_artist(Artist song_artist) {
        this.song_artist = song_artist;
    }
}