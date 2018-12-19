package com.ecitele.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecitele.training.dal.ProductDAO;
import com.ecitele.training.domain.Product;

@Service 
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO dao;

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	public int addNewProduct(Product p) {
		if (p.getPrice() * p.getQoh() >= 10000) {
			Product saved = dao.save(p);
			return saved.getId();
		} else {
			throw new IllegalArgumentException("product value is too low");
		}
	}

	public Product findOne(int id) {
		return dao.findOne(id);
	}

	public List<Product> findAll() {
		return dao.findAll();
	}

}
