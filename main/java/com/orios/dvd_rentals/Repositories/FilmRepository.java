package com.orios.dvd_rentals.Repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentals.Film;

@Repository
public interface FilmRepository extends CrudRepository <Film, Integer>{

	@Query(value = "select * from film "
			+ "join film_category on film.film_id = film_category.film_id "
			+ "join category on category.category_id = film_category.category_id "
			+ "where category.category_id = :id",
			nativeQuery = true)
	public List<Film> getFilmsByCategoryId(@Param("id") Integer id);
	
	
	@Query(value="select * from film "
			+ "join film_actor on film.film_id = film_actor.film_id "
			+ "join actor on film_actor.actor_id = actor.actor_id "
			+ "where actor.actor_id = :id "
			+ "limit 20",
			nativeQuery= true)
	public List<Film> getFilmsByActorId(@Param("id") Integer id);

}
