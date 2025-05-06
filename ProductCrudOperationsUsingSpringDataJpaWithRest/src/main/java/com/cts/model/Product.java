package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products_info")
@Data
@NoArgsConstructor
public class Product {

	@Id
	@Column(name = "pid")
	@GeneratedValue
	private int productId;
	private String productName;
	private int productPrice;
	private String productCategory;
	@Column(name = "quantity")
	private int productQuantity;
	
	public Product(String productName, int productPrice, String productCategory, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}

}
