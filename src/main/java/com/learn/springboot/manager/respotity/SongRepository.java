//package com.learn.springboot.manager.respotity;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.stereotype.Repository;
//
//import com.learn.springboot.manager.model.Song;
//
//@Repository
//public abstract class SongRepository implements ISongRepository{
//	
//	public List<Song>getSongs (){
//		return this.findAll();
//	}
//	
//	public Optional<Song> getSongById(int id){
//		return this.findById(id);
//	}
//	public void createOrUpdateSong (Song song) {
//		this.createOrUpdateSong(song);
//		
//	}
//	public void deleteSong(int id) {
//		this.deleteById(id);
//	}
//
//}
