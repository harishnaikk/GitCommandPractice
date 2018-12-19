package com.ecitele.training.service;

import java.util.List;

import com.ecitele.training.domain.Product;

public interface ProductService {
	
	public int addNewProduct(Product p);
	public Product findOne(int id);
	public List<Product> findAll();
}