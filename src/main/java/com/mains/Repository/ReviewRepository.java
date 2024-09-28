package com.mains.Repository;

import com.mains.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> { // Thay Long thành Integer
    // Tìm tất cả các đánh giá của một sản phẩm dựa vào ProductID
    List<Review> findByProduct_ProductID(Integer productID);

    // Tìm tất cả các đánh giá của một người dùng dựa vào UserID
    List<Review> findByUser_UserID(Integer userID);

    // Tìm tất cả các đánh giá dựa trên số sao đánh giá của sản phẩm
    List<Review> findByProduct_StarGreaterThanEqual(int star);
}