package com.orios.dvd_rentals.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orios.dvd_rentals.Services.ActorService;
import com.orios.dvd_rentals.Services.FilmService;

import rentals.Actor;
import rentals.Film;

@Controller
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	private FilmService filmService; 
	@Autowired 
	private ActorService actorService;
	
	@GetMapping("/{id}")
	public String getFilmById(@PathVariable("id") Integer id, Model model){
		final Optional<Film> film = filmService.getFilmById(id);
		if(film.isPresent()){
			model.addAttribute("film", film.get());
			final List<Actor> filmCast = actorService.findActorsByFilmId(id);
			model.addAttribute("actors", filmCast);
		}
		return "film";
	}
}
