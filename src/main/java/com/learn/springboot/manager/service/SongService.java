//package com.learn.springboot.manager.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import com.learn.springboot.manager.model.Song;
//import com.learn.springboot.manager.respotity.SongRepository;
//
//
//
//@Service
//public class SongService  {
//	
//	@Autowired
//	SongRepository songRepository;
//	
//	public List<Song> getSongs(){
//		return this.songRepository.getSongs();
//	}
//	
//	public Optional<Song> getSongById(int id) {
//		return this.songRepository.getSongById(id);
//	}
//	
//	public void createOrUpdateSong (Song song) {
//		this.songRepository.createOrUpdateSong(song);
//	}
//    
//	public void deleteSong(int id) {
//		this.songRepository.deleteSong(id);
//	}
//    
//	
//	
//	
//
//}
