package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	// Tìm tất cả các đánh giá của một sản phẩm dựa vào ProductID
	List<Review> findByProduct_ProductID(Long productID);

	// Tìm tất cả các đánh giá của một người dùng dựa vào UserID
	List<Review> findByUser_UserID(Long userID);

	// Tìm tất cả các đánh giá dựa trên số sao đánh giá của sản phẩm
	List<Review> findByProduct_StarGreaterThanEqual(int star);
}
