package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Product;
import com.cts.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	ProductRepository repository;
	

	@Override
	public String saveProduct(Product product) {
		log.info("In ProductServiceImple saveproduct method...");
		 Product p =  repository.save(product);
		 if(p!=null)
			 return "Product saved successfully";
		 else
			 return "Product not saved something went wrong";
	}

	@Override
	public Product updateProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public String removeProduct(int productId) {
		 repository.deleteById(productId);
		 return "Product deleted";
	}

	@Override
	public Product getProduct(int productId) {
		Optional<Product> optional = repository.findById(productId);
		return optional.get();
	}

	@Override
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public List<Product> getAllProductsBetween(int initialPrice, int finalPrice) {
		return repository.findByProductPriceBetween(initialPrice, finalPrice);
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		return repository.findByProductCategory(category);
	}

	@Override
	public List<Product> getAllProductsGreaterThanPrice(int price) {
		return repository.findByProductPriceGreaterThan(price);
	}
	
}
