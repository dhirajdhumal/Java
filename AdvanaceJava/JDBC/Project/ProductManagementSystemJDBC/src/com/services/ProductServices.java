package com.services;

import java.util.List;

import com.Dao.ProductDao;
import com.Entity.Product;
import com.exception.NoProductAvailableException;
import com.exception.ProductAlreadyUpdatedException;

public class ProductServices {
	ProductDao dao = new ProductDao();
	
	public String insertMultipleProducts(List<Product> product) {
		return dao.insertMultipleProducts(product);
	}
	
	public String updateProduct(Product product) {
		 int value = dao.updateProduct(product);
		 if(value == 0) {
			 throw new NoProductAvailableException("Exception: No Product Found");
		 }  
		 return "Product Updated Successfully";
	}
	
	public String deleteProduct(int id) {
		int value = dao.deleteProduct(id);
		if(value == 0) {
			throw new NoProductAvailableException("Exception: No Product Found");
		}	
		return "Product Deleted Successfully";
	}
}
