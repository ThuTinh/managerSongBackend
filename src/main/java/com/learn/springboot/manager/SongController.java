//package com.learn.springboot.manager;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.learn.springboot.manager.model.Song;
//import com.learn.springboot.manager.service.SongService;
//
//
//
//@RestController
//@RequestMapping(value = "/api")
//public class SongController {
//
//	@Autowired(required = true)
//	private SongService songService;
//	
//
//    @CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping(value = "/songs")
//	public List<Song> getSongs(){
//	//	return  songService.getSongs();
//    	return null;
//	}
//    
//
//    @CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping(value = "/songs/{id}")
//	public Optional<Song> getSongById(@PathVariable int id) {
////		return songService.getSongById(id);	
//    	return null;
//	}
//    
//    @GetMapping(value = "/sayHello")
//	public String sayHello() {
//		return "JHJHJHJJ";
//	}
//	
//}
