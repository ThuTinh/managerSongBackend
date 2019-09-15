package com.learn.springboot.manager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learn.springboot.manager.model.Song;
import com.learn.springboot.manager.respotity.ISongRepository;
//import com.learn.springboot.manager.respotity.SongRepository;
//import com.learn.springboot.manager.service.SongService;

@RestController
@RequestMapping(value = "/api")
public class SongController {

//	@Autowired
//	private SongService songService;
	@Autowired
	private ISongRepository iSongReposity;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value = "/songs")
	public List<Song> getSongs() {

		// return songService.getSongs();
		return iSongReposity.findAll();

	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value = "/songs/{id}")
	public Optional<Song> getSongById(@PathVariable int id) {
		// return songService.getSongById(id);
		return iSongReposity.findById(id);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(value = "/songs")
	public void CreateOrUpdate(@RequestBody Song song) {

		// songService.createOrUpdateSong(song);
		iSongReposity.save(song);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(value = "/songs/{id}")
	public void deleteSong(@PathVariable int id) {
		// songService.deleteSong(id);
		iSongReposity.deleteById(id);

	}

}
