package com.learn.springboot.manager.respotity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.manager.model.Song;


public interface ISongRepository  extends JpaRepository<Song, Integer>{
	
//	List<Song>getSongs ();
//	Optional<Song> getSongById(int id);
//	void createOrUpdateSong (Song song);
//	Optional<Song>	findSongByName(String name);
//	void deleteSong(int id);
//	
	
	
}
