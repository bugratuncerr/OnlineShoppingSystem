package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Product;

public interface ProductService {
	
	Product save(Product product);

	List<Product> findAll();
	
	Product findOne(Long id);
}
