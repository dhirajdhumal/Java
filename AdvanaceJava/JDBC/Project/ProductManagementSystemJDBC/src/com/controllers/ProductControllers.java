package com.controllers;

import com.Entity.Product;
import com.services.ProductServices;
import java.util.List;

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

	public Product get(int id){
		return services.getProduct(id);
	}
	public List<Product> getAll(){
		return services.getProduct();
	}

}
