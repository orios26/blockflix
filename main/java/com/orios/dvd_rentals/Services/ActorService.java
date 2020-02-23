package com.orios.dvd_rentals.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.orios.dvd_rentals.Repositories.ActorRepository;

import rentals.Actor;

@Service
public class ActorService {
	
	@Autowired
	private ActorRepository actorRepository;
	
	public Page<Actor> getAllActors(Pageable pageable){
		Page<Actor> allActors = actorRepository.allActors(pageable);
		return allActors;
	}
	
	public Optional<Actor> findById(Integer id){
		return actorRepository.findById(id);
	}
	
	public List<Actor> findActorsByFilmId(Integer id){
		final List<Actor> actorResults = actorRepository.actorsByFilmId(id);
		return actorResults;
	}
	
	public List<Actor> findAll(){
		final List<Actor> allActors = (List<Actor>) actorRepository.findAll();
		return allActors;
	}
}
