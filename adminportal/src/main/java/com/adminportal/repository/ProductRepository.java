package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
