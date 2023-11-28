/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.nxttrendz1.model.*;
import com.example.nxttrendz1.service.*;

import com.example.nxttrendz1.service.ReviewJpaService;

@RestController
public class ReviewController {

    @Autowired
    private ReviewJpaService reviewService;

    @GetMapping("/products/reviews")
    public ArrayList<Review> getReview() {
        return reviewService.getReview();
    }

    @PostMapping("/products/reviews")
    public Review addReview(Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping("/products/reviews/{reviewId}")
    public Review getReviewById(@PathVariable("reviewId") int reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    @PutMapping("/products/reviews/{reviewId}")
    public Review updateReviewById(@PathVariable("reviewId") int reviewId, @RequestBody Review review) {
        return reviewService.updateReviewById(reviewId, review);
    }

    @DeleteMapping("/products/reviews/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") int reviewId) {
        reviewService.deleteReview(reviewId);
    }

    @GetMapping("/reviews/{reviewId}/product")
    public Product getReviewProduct(int reviewId) {
        return reviewService.getReviewProduct(reviewId);

    }

}