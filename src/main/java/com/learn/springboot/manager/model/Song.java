package com.learn.springboot.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "song")
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name_song" , columnDefinition = "VARCHAR(100)")
	private String nameSong;
	
	@Column(name = "singer",  columnDefinition = "VARCHAR(100)")
	private String singer;
	
	@Column(name = "composer",  columnDefinition = "VARCHAR(100)")
	private String composer;
	
	@Column(name = "release_year" , columnDefinition = "INT")
	private int releaseYear;
	
	public void setNameSong( String nameSong) {
		this.nameSong = nameSong;
	}
	
	public String getNameSong() {
		return this.nameSong;
	}
	
	public void setSinger( String singer) {
		this.singer = singer;
	}
	
	public String getSinger() {
		return this.singer;
	}
	
	public void setComposer( String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return this.composer;
	}
	
	public void setReleaseYear( int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public int getReleaseYear() {
		return this.releaseYear;
	}
	
	

}
