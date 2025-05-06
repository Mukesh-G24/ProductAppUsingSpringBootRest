package com.cts.service;

import java.util.List;

import com.cts.model.Product;

public interface ProductService {

	String saveProduct(Product product);

	Product updateProduct(Product product);

	String removeProduct(int productId);

	Product getProduct(int productId);

	List<Product> getAllProducts();

	List<Product> getAllProductsBetween(int initialPrice, int finalPrice);

	List<Product> getAllProductsByCategory(String category);
	
	List<Product> getAllProductsGreaterThanPrice(int price);

}
