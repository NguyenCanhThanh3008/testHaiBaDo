package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entity.Product;
import Repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/byCategory")
	public List<Product> getProductsByCategory(@RequestParam String category) {
		return productRepository.findByCategory(category);
	}

	@GetMapping("/byPrice")
	public List<Product> getProductsByPrice(@RequestParam Double price) {
		return productRepository.findByPriceLessThan(price);
	}

	@GetMapping("/byStar")
	public List<Product> getProductsByStar(@RequestParam int star) {
		return productRepository.findByStarGreaterThanEqual(star);
	}
}
