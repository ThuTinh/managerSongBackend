package com.learn.springboot.manager.respotity;
import org.springframework.data.jpa.repository.JpaRepository;
import com.learn.springboot.manager.model.Song;


public interface ISongRepository  extends JpaRepository<Song, Integer>{
	

	
}
