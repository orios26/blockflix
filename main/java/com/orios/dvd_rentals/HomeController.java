package com.orios.dvd_rentals;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import rentals.Category;

@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/")
	public String home(Model model) {
		final List<String> categoryNames = new ArrayList<>();
		final List<Category> categories = categoryService.findAll();
		categories.forEach(c -> {
			categoryNames.add(c.getName());
		});
		model.addAttribute("categories", categories);
		return "home";
	}
}
