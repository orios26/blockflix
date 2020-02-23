package com.orios.dvd_rentals.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.orios.dvd_rentals.Services.CategoryService;

import rentals.Category;

@Controller
public class HomeController {
		
	@GetMapping("/")
	public String home() {
		return "redirect:/category";
	}
}
