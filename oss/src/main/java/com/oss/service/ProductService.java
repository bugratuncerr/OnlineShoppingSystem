package com.oss.service;

import java.util.List;

import com.oss.domain.Product;

public interface ProductService {
	List<Product> findAll ();
	
	Product findOne(Long id);
}
