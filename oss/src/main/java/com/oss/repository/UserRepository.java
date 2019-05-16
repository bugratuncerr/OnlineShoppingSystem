package com.oss.repository;

import org.springframework.data.repository.CrudRepository;

import com.oss.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
