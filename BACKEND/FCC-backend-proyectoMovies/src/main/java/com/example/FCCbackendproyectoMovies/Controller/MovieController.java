package com.example.FCCbackendproyectoMovies.Controller;

import com.example.FCCbackendproyectoMovies.Movie;
import com.example.FCCbackendproyectoMovies.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies (){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK) ;
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie (@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id), HttpStatus.OK);
//    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByImdbID (@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovieByImdbId(imdbId), HttpStatus.OK);
    }
}

