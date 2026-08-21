package com.controllers;

import java.util.List;

import com.Entity.Product;
import com.services.ProductServices;

public class ProductControllers {
	ProductServices services = new ProductServices();
	
	public String insert(List<Product> product) {
		return services.insertMultipleProducts(product);
	}
	
	public String update(Product product) {
		return services.updateProduct(product);
	}
	
	public String delete(int id) {
		return services.deleteProduct(id);
	}
	
	
}
