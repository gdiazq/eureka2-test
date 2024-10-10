package com.iteureka.semana2.service;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.iteureka.semana2.model.CustomerEntity;
import com.iteureka.semana2.repository.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class CustomerService{

    private final CustomerRepository customerRepository;

    public Iterable<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }

    public Optional<CustomerEntity> findById(Long id) {
        return customerRepository.findById(id);
    }

    public CustomerEntity save(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }
    
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}
