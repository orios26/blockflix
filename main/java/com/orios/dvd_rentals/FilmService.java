package com.orios.dvd_rentals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import rentals.Film;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;
	
	public List<Film> getFilmsByCategoryId(Integer id){
		final List<Film> filmResults = filmRepository.getFilmsByCategoryId(id);
		return filmResults;
	}
}
