package com.davidnestor.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.davidnestor.lookify.models.Song;
import com.davidnestor.lookify.services.SongService;

@Controller
public class SongController {
	@Autowired
	private SongService sService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dash(Model viewmodel) {
		List<Song> allSongs = this.sService.getAllSongs();
		viewmodel.addAttribute("songs",allSongs);
		return "dash.jsp";
	}
	
	@GetMapping("/song/new")
	public String newsong(Model viewmodel) {
		viewmodel.addAttribute("Song", new Song());
		return "add.jsp";
	}
	
	@GetMapping("/song/{id}/delete")
	public String deletesong(@PathVariable("id") Long id) {
		this.sService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@PostMapping("/search/")
	public String searchSongs(@RequestParam("query") String search, Model viewmodel) {
		List<Song> allSongs = this.sService.searchSongs(search);
		viewmodel.addAttribute("songs", allSongs);
		return "search.jsp";
	}
	@GetMapping("/search/topTen")
	public String topTen(Model viewmodel) {
		List<Song> topSongs = this.sService.topTen();
		viewmodel.addAttribute("songs", topSongs);
		return "top.jsp";
	}
	@GetMapping("/song/{id}")
	public String showSong(@PathVariable("id") Long id, Model viewmodel) {
		viewmodel.addAttribute("songs", this.sService.getSong(id));
		return "song.jsp";
	}
	
	@PostMapping("/song/new/add")
	public String update(@Valid @ModelAttribute("song") Song song, BindingResult result) {
//		this.sService.createSongHTML(title, artist, rating);
		if(result.hasErrors()) {
			return "redirect:/song/new";
		}
		else {
		this.sService.addSong(song);
		return "redirect:/dashboard";
		}
	}
}
