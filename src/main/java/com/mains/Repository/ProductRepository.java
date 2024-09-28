package com.mains.Repository;

import com.mains.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Tìm tất cả sản phẩm theo tên (case-insensitive)
    List<Product> findByNameIgnoreCase(String name);

    // Tìm tất cả sản phẩm theo danh mục
    List<Product> findByCategory(String category);

    // Tìm tất cả sản phẩm theo giá dưới một mức giá nhất định
    List<Product> findByPriceLessThan(Double price);

    // Tìm tất cả sản phẩm có sao đánh giá lớn hơn hoặc bằng giá trị cung cấp
    List<Product> findByStarGreaterThanEqual(int star);

    // Tìm tất cả sản phẩm đang giảm giá (giảm giá > 0)
    List<Product> findByDiscountGreaterThan(double discount);

    // Tìm tất cả sản phẩm có số lượng lớn hơn giá trị cung cấp
    List<Product> findByQuantityGreaterThan(int quantity);

    // Tìm tất cả sản phẩm có màu cụ thể
    List<Product> findByColor(String color);

    // Tìm tất cả sản phẩm theo size cụ thể
    List<Product> findBySize(String size);

    // Tìm sản phẩm theo kiểu
    List<Product> findByStyle(String style);

    // Tìm sản phẩm theo ID
    Optional<Product> findById(int id);

    // Tùy chỉnh query để tìm sản phẩm dựa trên giá và danh mục
    @Query("SELECT p FROM Product p WHERE p.price < :price AND p.category = :category")
    List<Product> findProductsByPriceAndCategory(@Param("price") Double price, @Param("category") String category);
}

