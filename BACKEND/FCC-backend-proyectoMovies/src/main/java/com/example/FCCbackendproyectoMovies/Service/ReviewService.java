package com.example.FCCbackendproyectoMovies.Service;

import com.example.FCCbackendproyectoMovies.Movie;
import com.example.FCCbackendproyectoMovies.Repository.ReviewRepository;
import com.example.FCCbackendproyectoMovies.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    // Repository es una forma de interactuar con la DB. Template tambien es una.
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String reviewBody, String imdbID){
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbID))
                .apply(new Update().push("reviewsIds").value(review))
                .first();

        return review;
    }

}
