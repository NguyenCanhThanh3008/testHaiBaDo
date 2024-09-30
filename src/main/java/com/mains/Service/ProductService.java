package com.mains.Service;

import com.mains.Entity.Product;
import com.mains.Repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Find products by name
    public List<Product> findByName(String name) {
        return productRepository.findByNameIgnoreCase(name);
    }

    // Find products by category
    public List<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    // Find products by price below a certain amount
    public List<Product> findByPriceLessThan(Double price) {
        return productRepository.findByPriceLessThan(price);
    }

    // Find products by rating stars
    public List<Product> findByStarGreaterThanEqual(int star) {
        return productRepository.findByStarGreaterThanEqual(star);
    }

    // Find products by discount
    public List<Product> findByDiscountGreaterThan(double discount) {
        return productRepository.findByDiscountGreaterThan(discount);
    }

    // Find products by quantity
    public List<Product> findByQuantityGreaterThan(int quantity) {
        return productRepository.findByQuantityGreaterThan(quantity);
    }

    // Find products by color
    public List<Product> findByColor(String color) {
        return productRepository.findByColor(color);
    }

    // Find products by size
    public List<Product> findBySize(String size) {
        return productRepository.findBySize(size);
    }

    // Find products by style
    public List<Product> findByStyle(String style) {
        return productRepository.findByStyle(style);
    }

    // Find product by ID
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    // Method to add a new product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Method to delete a product by ID
    public ResponseEntity<Void> deleteProduct(int id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.notFound().build(); // 404 Not Found
    }

    public Product editProductById(int id, Product product) {
        // Check if the product exists
        Optional<Product> existingProductOpt = productRepository.findById(id);
        if (existingProductOpt.isPresent()) {
            Product existingProduct = existingProductOpt.get();

            // Update product details
            existingProduct.setName(product.getName());
            existingProduct.setCategory(product.getCategory());
            existingProduct.setStar(product.getStar());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setDiscount(product.getDiscount());
            existingProduct.setColor(product.getColor());
            existingProduct.setSize(product.getSize());
            existingProduct.setStyle(product.getStyle());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setDescription(product.getDescription());

            return productRepository.save(existingProduct); // Save the updated product
        } else {
            throw new RuntimeException("Product not found with ID: " + id);
        }
    }

    // Find products by price and category
    public List<Product> findProductsByPriceAndCategory(Double price, String category) {
        return productRepository.findProductsByPriceAndCategory(price, category);
    }

}
