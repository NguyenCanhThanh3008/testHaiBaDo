package com.mains.Controller;

import com.mains.Entity.Product;
import com.mains.Service.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
