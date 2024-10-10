package com.iteureka.semana2.controller;

import com.iteureka.semana2.model.CustomerEntity;
import com.iteureka.semana2.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CustomerControllerTest {

    @InjectMocks
    private CustomerController customerController;

    @Mock
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllCustomer() {
        when(customerService.findAll()).thenReturn(Collections.emptyList());

        Iterable<CustomerEntity> customers = customerController.getAllCustomer();

        assertNotNull(customers);
        verify(customerService, times(1)).findAll();
    }

    @Test
    void testGetCustomerById() {
        Long id = 1L;
        CustomerEntity customer = new CustomerEntity();
        customer.setId(id);

        when(customerService.findById(id)).thenReturn(Optional.of(customer));

        Optional<CustomerEntity> foundCustomer = customerController.getCustomerById(id);

        assertTrue(foundCustomer.isPresent());
        assertEquals(id, foundCustomer.get().getId());
        verify(customerService, times(1)).findById(id);
    }

    @Test
    void testSaveCustomer() {
        CustomerEntity customer = new CustomerEntity();
        when(customerService.save(any(CustomerEntity.class))).thenReturn(customer);

        CustomerEntity savedCustomer = customerController.saveCustomer(customer);

        assertNotNull(savedCustomer);
        verify(customerService, times(1)).save(customer);
    }

    @Test
    void testDeleteCustomerById() {
        Long id = 1L;

        customerController.deleteCustomerById(id);

        verify(customerService, times(1)).deleteById(id);
    }
}