package com.orios.dvd_rentals;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rentals.Category;

@Repository
public interface CategoryRepository extends CrudRepository <Category, Integer> {

}
