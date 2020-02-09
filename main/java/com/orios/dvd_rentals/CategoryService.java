package com.orios.dvd_rentals;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentals.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Optional<Category> findById(Integer id) {
		return categoryRepository.findById(id);
	}
	
	public List<Category> findAll(){
		final List<Category> allCategories = (List<Category>) categoryRepository.findAll();
		return allCategories;
	}

}
