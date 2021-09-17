package com.udemy.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.udemy.entities.Product;
import com.udemy.services.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
//		double sum1 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'X');
//		double sum1 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		double sum1 = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		double sum2 = list.stream().filter(p -> p.getName().charAt(0) == 'X').mapToDouble(Product::getPrice).sum();
		double sum3 = list.stream().filter(p -> p.getName().charAt(0) == 'T').mapToDouble(Product::getPrice).sum();
		double sum4 = list.stream().filter(p -> p.getPrice() < 100.0).mapToDouble(Product::getPrice).sum();
		
		System.out.println("Sum1: " + String.format("%.2f", sum1));
		System.out.println("Sum2: " + String.format("%.2f", sum2));
		System.out.println("Sum3: " + String.format("%.2f", sum3));
		System.out.println("Sum4: " + String.format("%.2f", sum4));
		
		
	}

}
