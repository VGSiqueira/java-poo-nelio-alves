package com.udemy.entities;

public class Product {

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	public boolean nonStaticProductPredicate() {
		return this.price >= 100.0;
	}

	public static void staticProductPrice(Product p) {
		p.setPrice(p.getPrice()*1.1);
	}
	
	public void nonStaticProductPrice() {
		this.price = this.price*1.1;
	}
	
	public static String staticUpperCase(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCase() {
		return this.name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "[Product: " + name + ", price: " + String.format("%.2f", price) + "]";
	}

}
