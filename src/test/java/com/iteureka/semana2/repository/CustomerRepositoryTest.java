package com.iteureka.semana2.repository;

import com.iteureka.semana2.model.CustomerEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void testSaveAndFindCustomerById() {
        // Crear un nuevo cliente
        CustomerEntity customer = new CustomerEntity();
        customer.setNombre("Nuevo Cliente");
        customer.setCasa_matriz("Nueva Casa Matriz");

        // Guardar el cliente en la base de datos
        CustomerEntity savedCustomer = customerRepository.save(customer);

        // Buscar el cliente por su ID
        Optional<CustomerEntity> foundCustomer = customerRepository.findById(savedCustomer.getId());

        // Verificar que el cliente fue encontrado y que los datos coinciden
        assertTrue(foundCustomer.isPresent());
        assertEquals("Nuevo Cliente", foundCustomer.get().getNombre());
    }

    @Test
    void testDeleteCustomerById() {
        // Crear un nuevo cliente
        CustomerEntity customer = new CustomerEntity();
        customer.setNombre("Nuevo Cliente");
        customer.setCasa_matriz("Nueva Casa Matriz");

        // Guardar el cliente en la base de datos
        CustomerEntity savedCustomer = customerRepository.save(customer);

        // Eliminar el cliente por su ID
        customerRepository.deleteById(savedCustomer.getId());

        // Verificar que el cliente ha sido eliminado
        Optional<CustomerEntity> foundCustomer = customerRepository.findById(savedCustomer.getId());
        assertFalse(foundCustomer.isPresent());
    }
}