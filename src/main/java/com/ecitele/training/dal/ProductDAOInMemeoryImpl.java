package com.ecitele.training.dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ecitele.training.domain.Product;

@Repository
public class ProductDAOInMemeoryImpl implements ProductDAO {

	Map<Integer, Product> db = new HashMap<Integer, Product>();
	int idSequence = 0;

	public Product save(Product p) {
		int id = ++idSequence;
		p.setId(id);
		db.put(id, p);
		return p;
	}

	public Product findOne(int id) {
		return db.get(id);
	}

	public List<Product> findAll() {
		return new ArrayList<Product>(db.values());
	}

}
