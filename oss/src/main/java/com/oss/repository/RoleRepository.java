package com.oss.repository;

import org.springframework.data.repository.CrudRepository;

import com.oss.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
