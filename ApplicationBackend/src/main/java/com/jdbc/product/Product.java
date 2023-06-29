package com.jdbc.product;

public class Product {
	
	private int product_id; 
	private String product_name ;
	private int product_price;
	private String product_manu_fac ;
	
	public Product(int product_id, String product_name, int product_price, String product_manu_fac) {
		super();
			this.product_id = product_id;
			this.product_name = product_name;
			this.product_price = product_price;
			this.product_manu_fac = product_manu_fac;
	}
	
		public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_manu_fac() {
		return product_manu_fac;
	}
	public void setProduct_manu_fac(String product_manu_fac) {
		this.product_manu_fac = product_manu_fac;
	}
	
	
	

}
