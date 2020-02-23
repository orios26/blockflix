package com.orios.dvd_rentals.Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orios.dvd_rentals.Services.ActorService;
import com.orios.dvd_rentals.Services.FilmService;

import rentals.Actor;
import rentals.Film;

@RequestMapping("/actor")
@Controller
public class ActorController {

	@Autowired
	private ActorService actorService;
	@Autowired FilmService filmService;

	@GetMapping()
	public String getAllActors(Model model) {
		Pageable pageable = PageRequest.of(5, 20);
		final Page<Actor> allActors = actorService.getAllActors(pageable);
		int pageCount = allActors.getTotalPages();
		model.addAttribute("actors", allActors);
		model.addAttribute("finalPage", pageCount-1);
		return "actors";
	}
	
	@GetMapping("/{id}")
	public String getActorById(@PathVariable("id") Integer id, Model model) {
		Optional<Actor> actor = actorService.findById(id);
		if(actor.isPresent()) {
			model.addAttribute("actor", actor.get());
		} //add some exception handling here
		
		List<Film> associatedFilms = filmService.getFilmsByActorId(id);
		model.addAttribute("films", associatedFilms);
		
		return "actorDetailed";
	}


	@SuppressWarnings("null")
	@GetMapping(path="/firstPage", produces="application/json")
	@ResponseBody
	public ResponseEntity getActorsFirstPage(int desiredPage) throws JsonProcessingException {
		Pageable pageable = PageRequest.of(desiredPage, 20);
		final Page<Actor> actorsPage = actorService.getAllActors(pageable);
		List<Actor> allActors = actorsPage.getContent();
		final List<Map<String, String>> allActorsList = new ArrayList<>();
		allActors.forEach(actor -> {
			Map<String, String> map = Stream.of(new String[][] {
				{"id", Integer.toString(actor.getActorId())},
				{"firstName", actor.getFirstName()},
				{"lastName", actor.getLastName()}
			}).collect(Collectors.toMap(data -> data[0],data -> data[1]));
			allActorsList.add(map);
		});
		
		ObjectMapper mapper = new ObjectMapper();
		return new ResponseEntity<String>(mapper.writeValueAsString(allActorsList), HttpStatus.OK);
	}

}
