package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByProductPriceBetween(int initialPrice, int finalPrice);
	
	List<Product> findByProductCategory(String category);
	
	List<Product> findByProductPriceGreaterThan(int price);
	
}
