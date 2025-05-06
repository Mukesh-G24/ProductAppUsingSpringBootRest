//package com.cts;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cts.model.Product;
//import com.cts.repository.ProductRepositoryImpl;
//import com.cts.service.ProductServiceImpl;
//
//@SpringBootTest
//class ProductCrudOperationsUsingSpringJpaApplicationTests {
//
//	@Mock
//	ProductRepository repository;
//	
//	@InjectMocks
//	ProductServiceImpl service;
//	
//	@Test
//	void saveProductTest() {
//		Product product = new Product("Apple", 150000, "electronics", 10);
//		Mockito.when(repository.saveProduct(product)).thenReturn("Product Saved Successfully");
//		String res = service.saveProduct(product);
//		assertEquals("Product Saved Successfully", res);
//	}
//}
