package com.mains.Controller;

import com.mains.Entity.Product;
import com.mains.Service.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostConstruct
    public void init() {
        System.out.println("MyController initialized");
    }

    @GetMapping(value = { "/", "/list" })
    public List<Product> getAll() {
         return productService.getAllProducts();
    }

    @GetMapping("/byCategory")
    public List<Product> getProductsByCategory(@RequestParam String category) {
        return productService.findByCategory(category);
    }

    @GetMapping("/byPrice")
    public List<Product> getProductsByPrice(@RequestParam Double price) {
        return productService.findByPriceLessThan(price);
    }

    @GetMapping("/byStar")
    public List<Product> getProductsByStar(@RequestParam int star) {
        return productService.findByStarGreaterThanEqual(star);
    }

    @GetMapping("/byProductName")
    public List<Product> getProductsByName(@RequestParam String productName) {
        return productService.findByName(productName);
    }

    @GetMapping("/byProductId")
    public Optional<Product> getProductsById(@RequestParam int id) {
        return productService.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product createdProduct = productService.addProduct(product);
        return ResponseEntity.status(201).body(createdProduct);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Product> editProductById(@PathVariable int id, @RequestBody Product product) {
        Product updatedProduct = productService.editProductById(id, product);
        return ResponseEntity.ok(updatedProduct);
    }


}
