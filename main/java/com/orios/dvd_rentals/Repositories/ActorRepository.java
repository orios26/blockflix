package com.orios.dvd_rentals.Repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rentals.Actor;

@Repository
public interface ActorRepository extends CrudRepository <Actor, Integer> {
	
	@Query(value="select * from actor",
			countQuery ="select count(20)from actor",
			nativeQuery=true)
	Page<Actor> allActors(Pageable pageable);
	
	@Query(value="select * from actor"
			+ " join film_actor on film_actor.actor_id = actor.actor_id"
			+ " join film on film_actor.film_id = film.film_id "
			+ " where film.film_id = :id "
			+ " limit 20", 
			nativeQuery=true)
	List<Actor> actorsByFilmId(Integer id);
}
