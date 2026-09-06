package com.services;

import com.Dao.ProductDao;
import com.Entity.Product;
import com.exception.NoProductAvailableException;
import java.util.List;

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

	public Product getProduct(int id){
		Product product = dao.getProduct(id);
		if(product == null){
			throw new NoProductAvailableException("No Product is Found For this id");
		}

		return product;
	}

	public List<Product> getProduct(){
		List<Product> products = dao.getAllProduct();
		if(products == null){
			throw new NoProductAvailableException("No Products Are Available in Database");
		}
		return products;
	}
}
