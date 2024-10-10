package com.iteureka.semana2.repository;

import org.springframework.data.repository.CrudRepository;

import com.iteureka.semana2.model.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
}
