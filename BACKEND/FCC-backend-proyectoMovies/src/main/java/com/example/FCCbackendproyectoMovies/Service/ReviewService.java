package com.example.FCCbackendproyectoMovies.Service;

import com.example.FCCbackendproyectoMovies.Review;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    public Review createReview(String reviewBody, String imdbID){
        Review review = new Review(reviewBody);

    }
}
