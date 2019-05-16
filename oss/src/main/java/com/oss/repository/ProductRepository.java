package com.oss.repository;


import org.springframework.data.repository.CrudRepository;

import com.oss.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
