package com.mains.Repository;

import com.mains.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> { // Change Long to Integer
    // Find all reviews for a product based on ProductID
    List<Review> findByProduct_ProductID(Integer productID);

    // Find all reviews by a user based on UserID
    List<Review> findByUser_UserID(Integer userID);

    // Find all reviews based on the star rating of the product
    List<Review> findByProduct_StarGreaterThanEqual(int star);
}
