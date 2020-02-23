package com.orios.dvd_rentals.Controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orios.dvd_rentals.Services.CategoryService;
import com.orios.dvd_rentals.Services.FilmService;

import rentals.Category;
import rentals.Film;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	Logger logger = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/{id}")
	public String getCategory(@PathVariable("id") Integer id, Model model, Pageable pageable) {
		Optional<Category> category = categoryService.findById(id);
		if(category.isPresent()) {
			model.addAttribute("category", category.get());
			logger.info(category.get().toString());
			List<Film> filmsByCategory = filmService.getFilmsByCategoryId(Integer.valueOf(category.get().getCategoryId()));
			//Page<Film> filmsByCategory = filmService.getFilmsByCategoryId(Integer.valueOf(category.get().getCategoryId()), pageable);
			model.addAttribute("films", filmsByCategory);
		}
		return "category";
	}
}
