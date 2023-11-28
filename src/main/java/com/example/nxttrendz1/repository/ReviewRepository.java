/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.*;
import java.util.*;

public interface ReviewRepository {

    ArrayList<Review> getReview();

    Review addReview(Review review);

    Review getReviewById(int reviewId);

    Review updateReviewById(int reviewId, Review review);

    void deleteReview(int reviewId);

    Product getReviewProduct(int reviewId);

}