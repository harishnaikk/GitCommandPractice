package com.ecitele.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecitele.training.ui.ProductConsoleUI;

public class ProductApp {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		
		ProductConsoleUI ui = (ProductConsoleUI) context.getBean(ProductConsoleUI.class);
		ui.addProductWithUI();
	}

}
