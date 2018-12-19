// ui layer

package com.ecitele.training.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecitele.training.domain.Product;
import com.ecitele.training.service.ProductService;

@Component
public class ProductConsoleUI {
	@Autowired
	ProductService service1;
	
	public void setService(ProductService service) {// this is the name given in appcontext xml , concatting set 
		this.service1 = service;
	}
	
	public void addProductWithUI() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = kb.nextLine();
		System.out.println("Enter price: ");
		float price = Float.parseFloat(kb.nextLine());
		System.out.println("Enter QoH: ");
		int qoh = Integer.parseInt(kb.nextLine());
		Product p = new Product(name, price, qoh);
		int id = service1.addNewProduct(p);
		System.out.println("Created Product with Id: "+id);
	}

}
