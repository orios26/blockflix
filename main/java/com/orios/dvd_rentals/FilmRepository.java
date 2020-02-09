package com.orios.dvd_rentals;

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

}
