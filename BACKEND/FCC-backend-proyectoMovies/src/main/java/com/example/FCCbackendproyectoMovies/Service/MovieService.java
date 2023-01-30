package com.example.FCCbackendproyectoMovies.Service;

import com.example.FCCbackendproyectoMovies.Movie;
import com.example.FCCbackendproyectoMovies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    //le decimos a spring que inicialice esta clase por nosotros
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        //System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }

//    public Optional<Movie> singleMovie (ObjectId id){
//        return movieRepository.findById(id);
//    }

    public Optional<Movie> singleMovieByImdbId (String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }


}
