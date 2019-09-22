package com.learn.springboot.manager.controller;

import static org.junit.Assert.assertEquals;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer.MockRestServiceServerBuilder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.learn.springboot.manager.model.Song;
import com.learn.springboot.manager.service.SongService;



@RunWith(SpringRunner.class)
@WebMvcTest(value = SongController.class , secure = false)
public class SongContronllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean 
	private SongService service;
	

	static List<Song> songs = new ArrayList<Song>();
	static Song song1, song2;
	
	@BeforeClass
	public static void init() {
		song1 = new Song();
		song2 = new Song();
		song1.setId(1);
		song1.setNameSong("A");
		song1.setSinger("Tinh");
		song1.setComposer("Tinh");
		song1.setReleaseYear(2019);
		song2.setId(2);
		song2.setNameSong("B");
		song2.setSinger("Ngoc");
		song2.setComposer("Ngoc");
		song2.setReleaseYear(2018);
	
		songs.add(song1);
		songs.add(song2);	
	}
	
	
	@Test
	public void getSongTest() throws Exception {
		Mockito.when(service.getSongs()).thenReturn(songs);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/songs");
		MvcResult resutl = mockMvc.perform(requestBuilder).andReturn();
		String expected = "[{\"id\":1, \"nameSong\":\"A\", \"singer\":\"Tinh\", \"composer\":\"Tinh\",\"releaseYear\":2019 },{\"id\":2, \"nameSong\":\"B\", \"singer\":\"Ngoc\", \"composer\":\"Ngoc\",\"releaseYear\":2018 }]";
		System.out.println( "ahihi"+ resutl.getResponse().getContentAsString());
		JSONAssert.assertEquals(expected,resutl.getResponse().getContentAsString(), false);
		

	}
	
	@Test
	public void getSongByIdTest() throws Exception {
		Optional<Song> s1 = Optional.of(song1);
		Mockito.when(service.getSongById(Mockito.anyInt())).thenReturn(s1);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/songs/1");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String expected = "{\"id\":1, \"nameSong\":\"A\", \"singer\":\"Tinh\", \"composer\":\"Tinh\",\"releaseYear\":2019 }";
		System.out.println( "ahha"+ result.getResponse().getContentAsString());
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),false);
	}
	
	
	@Ignore
	@Test
	public void createSongTest() throws Exception {
		
		Song song = new Song();
		//song.setId(3);
		song.setNameSong("C");
		song.setSinger("Tinh");
		song.setComposer("Tinh");
		song.setReleaseYear(2019);		
//	Mockito.when(service.createOrUpdateSong(Mockito.any(Song.class))).thenReturn(song);
		RequestBuilder	requestBuilder = MockMvcRequestBuilders.post("/api/songs");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println("kaka"+result.getResponse() );
		assertEquals("200", result.getResponse().getStatus());
	}


	
	
	

	

}
