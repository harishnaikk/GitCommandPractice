//dal

package com.ecitele.training.dal;

import java.util.List;

import com.ecitele.training.domain.Product;

public interface ProductDAO {
	
	public Product save(Product p);
	public Product findOne(int id);
	public List<Product> findAll();

}
