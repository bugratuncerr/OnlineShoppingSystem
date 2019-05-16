package com.oss.repository;

import org.springframework.data.repository.CrudRepository;

import com.oss.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
