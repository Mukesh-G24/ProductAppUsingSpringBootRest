package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Product;
import com.cts.service.ProductService;

@RestController
@RequestMapping("/products") // (http://localhost:8080/products)
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("/getMsg") // (http://localhost:8080/products/getMsg)
	public String sayHello() {
		return "am trying to listen but am getting sleep";
	}

	@PostMapping("/saveproduct") // (http://localhost:8080/products/saveproduct)
	public String saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PutMapping("/updateproduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);

	}
	
	@GetMapping("/getproduct/{pid}")
	public Product fetchProduct(@PathVariable("pid") int productId) {
		return service.getProduct(productId);
		
	}
	
	@DeleteMapping("/removeproduct/{pid}")
	public String removeProduct(@PathVariable("pid") int productId) {
		return service.removeProduct(productId);
	}
	
	@GetMapping("getallproducts")
	public List<Product> fetchAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("getproductsbetween/{initialPrice}/{finalPrice}")
	public List<Product> fetchProductsBetween(@PathVariable("initialPrice") int initialPrice,@PathVariable("finalPrice") int finalPrice){
		return service.getAllProductsBetween(initialPrice, finalPrice);
	}
	
	@GetMapping("getproductsbycategory/{category}")
	public List<Product> fetchProductsByCategory(@PathVariable("category") String category){
		return service.getAllProductsByCategory(category);
	}
	
	@GetMapping("getproductspricegreaterthan/{price}")
	public List<Product> fetchProductsPriceGreaterThan(@PathVariable("price") int price){
		return service.getAllProductsGreaterThanPrice(price);
	}
	

}
