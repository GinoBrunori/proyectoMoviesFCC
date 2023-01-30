package com.example.FCCbackendproyectoMovies.Repository;

import com.example.FCCbackendproyectoMovies.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId > {

}
