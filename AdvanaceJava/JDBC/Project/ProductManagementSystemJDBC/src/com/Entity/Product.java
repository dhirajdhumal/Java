package com.Entity;
// id, productname, price, category, qty, mfgdate, expdate
public class Product {
	private int id;
	private String productname;
	private String category;
	private Double price;
	private int qty;
	private String mfgdate;
	private String expdate;
	
	public Product(int id, String productname, String category, Double price, int qty, String mfgdate, String expdate) {
		this.id = id;
		this.productname = productname;
		this.category = category;
		this.price = price;
		this.qty = qty;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
	}
	
	public int getId() {
		return id;
	}
	
	public String getProductName() {
		return productname;
	}
	
	public String getCategory() {
		return category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public String getMfg() {
		return mfgdate;
	}
	
	public String getExp() {
		return expdate;
	}
			
}
