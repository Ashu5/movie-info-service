package com.moviesinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MoviesInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesInfoApplication.class, args);
	}

}
