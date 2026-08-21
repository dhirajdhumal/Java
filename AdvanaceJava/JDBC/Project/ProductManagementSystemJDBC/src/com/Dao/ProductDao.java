package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.Entity.Product;
import com.JDBCConnection.JDBCUtil;

public class ProductDao {
	Connection con = JDBCUtil.createConnection();
	
	public void createDatabase() {
		try {
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("CREATE DATABASE product_management_system");
			
			System.out.println("Database created Successfully");

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createTable() {
		try {
			Statement stmt = con.createStatement();
//			int id, String productname, String category, Double price, int qty, String mfgdate, String expdate
			stmt.executeUpdate("CREATE TABLE products (id INT, productname VARCHAR(32), category VARCHAR(32), price FLOAT, qty INT, mfgdate VARCHAR(32), expdate VARCHAR(32))");
			
			System.out.println("Table Created Successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String insertData(Product product) {
		
		try {
			PreparedStatement pst = con.prepareStatement("INSERT INTO products VALUES(?,?,?,?,?,?,?)");
			
			pst.setInt(1,product.getId());
			pst.setString(2, product.getProductName());
			pst.setString(3, product.getCategory());
			pst.setDouble(4, product.getPrice());
			pst.setInt(5, product.getQty());
			pst.setString(6, product.getMfg());
			pst.setString(7, product.getExp());
			
			pst.executeUpdate();
			
			return "Data Insertend Successfully";
			
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String insertMultipleProducts(List<Product> product) {
		
		try {
			
			for(Product products:product) {
				PreparedStatement pst = con.prepareStatement("INSERT INTO products VALUES(?,?,?,?,?,?,?)");
				
				pst.setInt(1,products.getId());
				pst.setString(2, products.getProductName());
				pst.setString(3, products.getCategory());
				pst.setDouble(4, products.getPrice());
				pst.setInt(5, products.getQty());
				pst.setString(6, products.getMfg());
				pst.setString(7, products.getExp());
				
				pst.executeUpdate();
			}
			
			return "Data Insertend Successfully";
			
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public int updateProduct(Product product) {
		int value = 0;
		try {
			PreparedStatement pst = con.prepareStatement("update products set productname=?, category=? WHERE id=?");

			pst.setString(1, product.getProductName());
			pst.setString(2, product.getCategory());
			pst.setInt(3, product.getId());
			
			value = pst.executeUpdate();
			
		}catch(Exception e) {
			 e.getMessage();
		}
		return value;
	}
	
	public int deleteProduct(int id) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("delete from products WHERE id=?");
			
			pst.setInt(1, id);
			int value = pst.executeUpdate();
			return value;
			
		}catch(Exception e) {
			 e.getMessage();
			 return 0;
		}
		
	}
	
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		dao.createTable();
	}
}
