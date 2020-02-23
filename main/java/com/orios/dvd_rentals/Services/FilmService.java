package com.orios.dvd_rentals.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.orios.dvd_rentals.Repositories.FilmRepository;

import rentals.Film;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;
	
	public List<Film> getFilmsByCategoryId(Integer id){
		final List<Film> filmResults = filmRepository.getFilmsByCategoryId(id);
		return filmResults;
	}
	
	public List<Film> getFilmsByActorId(Integer id){
		final List<Film> filmResults = filmRepository.getFilmsByActorId(id);
		return filmResults;
	}
	
	public Optional<Film> getFilmById(Integer id){
		final Optional<Film> filmResult = filmRepository.findById(id);
		return filmResult;
	}
}
