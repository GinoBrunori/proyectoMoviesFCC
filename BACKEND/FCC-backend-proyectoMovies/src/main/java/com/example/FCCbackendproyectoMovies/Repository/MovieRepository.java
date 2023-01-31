package com.example.FCCbackendproyectoMovies.Repository;

import com.example.FCCbackendproyectoMovies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // Spring Boot ya se da cuenta del metodo que creamos. 👇
    Optional<Movie> findMovieByImdbId(String imdbId);

}
