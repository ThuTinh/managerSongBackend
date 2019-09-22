package com.learn.springboot.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springboot.manager.model.Song;
import com.learn.springboot.manager.respotity.ISongRepository;

@Service
public class SongService  {
	
	@Autowired
	ISongRepository songRepository;
	
	public List<Song> getSongs(){
		return this.songRepository.findAll();
	}
	
	public Optional<Song> getSongById(int id) {
		return this.songRepository.findById(id);
	}
	
	public void createOrUpdateSong (Song song) {
		this.songRepository.save(song);
		
	}
    
	public void deleteSong(int id) {
		this.songRepository.deleteById(id);
	}
    

}
