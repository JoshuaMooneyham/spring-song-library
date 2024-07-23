package com.jmooneyham.Module1.Repository;

import com.jmooneyham.Module1.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Repository is an interface that provides access to data in a database */

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}
