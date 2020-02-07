package com.orios.dvd_rentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("rentals")
public class DvdRentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdRentalsApplication.class, args);
	}

}
