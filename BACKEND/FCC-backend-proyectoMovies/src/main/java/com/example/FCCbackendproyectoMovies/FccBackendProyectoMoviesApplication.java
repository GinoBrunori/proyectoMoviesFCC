package com.example.FCCbackendproyectoMovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication

public class FccBackendProyectoMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FccBackendProyectoMoviesApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("api/**").allowedOrigins("http://localhost:3000").allowedMethods("*").allowedHeaders("*");
//			}
//		};
//	}
}
