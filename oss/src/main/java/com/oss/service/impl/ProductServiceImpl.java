package com.oss.service.impl;

import java.util.List;

import com.oss.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.repository.ProductRepository;
import com.oss.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}
	
	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}

}
