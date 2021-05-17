package com.davidnestor.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidnestor.lookify.models.Song;
import com.davidnestor.lookify.repositories.SongRepository;

@Service
public class SongService {
	@Autowired
	private SongRepository sRepo;
	
	public List<Song> getAllSongs(){
		return this.sRepo.findAll();
	}
	
	public List<Song> searchSongs(String search){
		List<Song> searchSongs = this.sRepo.findByArtistContaining(search);
		return searchSongs;
		
	}
	
	public List<Song> topTen(){
		List<Song> topSongs = this.sRepo.findTop10ByOrderByRating();
		return topSongs;
	}
	
	public Song getSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	public Song addSong(Song newsong) {
		return this.sRepo.save(newsong);
	}
	
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	
	public Song createSongHTML(String title, String artist, int rating) {
		Song newSong = new Song(title,artist,rating);
		return this.sRepo.save(newSong);
	}
}
