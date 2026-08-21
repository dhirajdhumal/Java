package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Entity.Product;
import com.controllers.ProductControllers;

public class ProductMain {
	ProductControllers controllers = new ProductControllers();
	
	public void insert() {
		
		Product product1 = new Product(1, "Mobile", "Electronics", 25000D, 965, "30-8-2005", "30-8-2015");
		Product product2 = new Product(2, "Laptop", "Electronics", 85000D, 100, "30-8-2005", "30-8-2015");
		Product product3 = new Product(3, "Tab", "Electronics", 5000D, 787, "30-8-2005", "30-8-2015");
		Product product4 = new Product(4, "Watch", "Electronics", 2000D, 987, "30-8-2005", "30-8-2015");
		Product product5 = new Product(5, "Blutooth", "Electronics", 700D, 1540, "30-8-2005", "30-8-2015");
		
		List<Product> products	= Arrays.asList(product1,product2,product2,product3,product4,product5);

		String msg = controllers.insert(products);
		System.out.println(msg);
	}
	
	public void update() { 
		try {
			Product product1 = new Product(2, "Samles", "Electronics", 25000D, 965, "30-8-2005", "30-8-2015");
			String msg = controllers.update(product1);
			System.out.println(msg);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void delete() {
		try {
			String msg = controllers.delete(1);
			System.out.println(msg);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	
	public static void main(String[] args) {
		ProductMain operation = new ProductMain();
		
		operation.update();
	}
	
}
