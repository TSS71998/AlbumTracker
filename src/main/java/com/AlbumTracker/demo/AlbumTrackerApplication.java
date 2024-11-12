package com.AlbumTracker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AlbumTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumTrackerApplication.class, args);
	}

}
