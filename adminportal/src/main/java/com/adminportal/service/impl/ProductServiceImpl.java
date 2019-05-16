package com.adminportal.service.impl;

import java.util.List;

import com.adminportal.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.repository.ProductRepository;
import com.adminportal.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}
	
	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}
}
