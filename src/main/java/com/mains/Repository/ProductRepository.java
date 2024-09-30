package com.mains.Repository;

import com.mains.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Find all products by name (case-insensitive)
    List<Product> findByNameIgnoreCase(String name);

    // Find all products by category
    List<Product> findByCategory(String category);

    // Find all products with price below a certain amount
    List<Product> findByPriceLessThan(Double price);

    // Find all products with rating stars greater than or equal to the provided value
    List<Product> findByStarGreaterThanEqual(int star);

    // Find all products that are on discount (discount > 0)
    List<Product> findByDiscountGreaterThan(double discount);

    // Find all products with quantity greater than the provided value
    List<Product> findByQuantityGreaterThan(int quantity);

    // Find all products by specific color
    List<Product> findByColor(String color);

    // Find all products by specific size
    List<Product> findBySize(String size);

    // Find products by style
    List<Product> findByStyle(String style);

    // Find product by ID
    Optional<Product> findById(int id);

    // Edit product
    default Product editProduct(Product product) {
        return save(product); // Save the object, will update if ID already exists
    }

    // Delete product by ID
    default void deleteProductById(int id) {
        deleteById(id); // Call delete method by ID
    }

    // Custom query to find products based on price and category
    @Query("SELECT p FROM Product p WHERE p.price < :price AND p.category = :category")
    List<Product> findProductsByPriceAndCategory(@Param("price") Double price, @Param("category") String category);
}
