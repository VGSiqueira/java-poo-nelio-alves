package com.udemy.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.udemy.entities.Product;

public class Program2 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));

//		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
//		
		// Estudando Predicate
		// 1-
//		double min = 100.0;
//		list.removeIf(p -> p.getPrice() >= min);
		// 2- Reference Method c/ método estático
//		list.removeIf(Product::staticProductPredicate);
		// 3- Reference Method s/ método estático
//		list.removeIf(Product::nonStaticProductPredicate);

//		list.forEach(System.out::println);

		// Estudando Consumer
		// 1- Reference Method c/ método estático
//		list.forEach(Product::staticProductPrice);
		// 2- Reference Method s/ método estático
//		list.forEach(Product::nonStaticProductPrice);
		// 3- Inline
//		double factor = 1.1;
//		list.forEach(p -> p.setPrice(p.getPrice()*factor));
//		list.forEach(System.out::println);

		// Estudando Function
		//1- Reference Method c/ método estático
//		List<String> staticUpperCaseList = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
//		staticUpperCaseList.forEach(System.out::println);
		//2- Reference Method s/ método estático
//		List<String> nonStaticUpperCaseList = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
//		nonStaticUpperCaseList.forEach(System.out::println);
		//3- Inline
//		List<String> upperCaseList = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
//		upperCaseList.forEach(System.out::println);
	}

}
