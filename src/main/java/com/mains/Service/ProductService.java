package com.mains.Service;

import com.mains.Entity.Product;
import com.mains.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Lấy tất cả sản phẩm
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Tìm sản phẩm theo tên
    public List<Product> findByName(String name) {
        return productRepository.findByNameIgnoreCase(name);
    }

    // Tìm sản phẩm theo danh mục
    public List<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    // Tìm sản phẩm theo giá dưới một mức giá nhất định
    public List<Product> findByPriceLessThan(Double price) {
        return productRepository.findByPriceLessThan(price);
    }

    // Tìm sản phẩm theo sao đánh giá
    public List<Product> findByStarGreaterThanEqual(int star) {
        return productRepository.findByStarGreaterThanEqual(star);
    }

    // Tìm sản phẩm theo giảm giá
    public List<Product> findByDiscountGreaterThan(double discount) {
        return productRepository.findByDiscountGreaterThan(discount);
    }

    // Tìm sản phẩm theo số lượng
    public List<Product> findByQuantityGreaterThan(int quantity) {
        return productRepository.findByQuantityGreaterThan(quantity);
    }

    // Tìm sản phẩm theo màu
    public List<Product> findByColor(String color) {
        return productRepository.findByColor(color);
    }

    // Tìm sản phẩm theo kích thước
    public List<Product> findBySize(String size) {
        return productRepository.findBySize(size);
    }

    // Tìm sản phẩm theo kiểu
    public List<Product> findByStyle(String style) {
        return productRepository.findByStyle(style);
    }

    // Tìm sản phẩm theo kiểu
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    // Method to add a new product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Tìm sản phẩm theo giá và danh mục
    public List<Product> findProductsByPriceAndCategory(Double price, String category) {
        return productRepository.findProductsByPriceAndCategory(price, category);
    }

}

